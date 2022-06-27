import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class BlogSearch {
	public static void writeHTML(ArrayList<String> list,String fileName) {
		byte[] encode;
		try {
			encode = Files.readAllBytes(Paths.get("template.html"));
			String tag = new String(encode,"UTF-8");
			System.out.println(tag);
			String table = "<table><tr><th>블로그명</th><th>작성일</th><th>글제목</th><th>링크</th></tr>";
			for(String row : list) {
				String cell[] = row.split("\t");
				table += "<tr>";
				for(String s : cell) {
					table += "<td>"+s+"</td>";
				}
				table += "</tr>";
			}
			table += "</table>";
			tag = tag.replace("{result}", table);
			System.out.println(tag);
			
			FileWriter fw = new FileWriter(fileName+".html");
			fw.write(tag);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static ArrayList<String> blogSearch(String text) {
		String clientId = "_1rIIr0u6hwdD4VpqYnd";
        String clientSecret = "k5ERzutCdQ";
        String apiURL = "https://openapi.naver.com/v1/search/blog";
        DataOutputStream dos = null;
        BufferedReader br = null;
        HttpURLConnection con = null;
        ArrayList<String> result = new ArrayList<String>();
        try {
			text = URLEncoder.encode(text,"UTF-8");
			
			String postParams = "?query=" + text;
			URL url = new URL(apiURL + postParams);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			
			con.setDoOutput(true);
			
			int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
            	 br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  
            	br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
			String msg = new String();
			
			while(true) {
				String str = br.readLine();
				if(str==null) break;
				msg += str;
			}
			
			System.out.println(msg);
			
			JSONObject json = new JSONObject(msg);
			JSONArray arr = json.getJSONArray("items");
			for(int i=0;i<arr.length();i++) {
				JSONObject obj = arr.getJSONObject(i);
				result.add(obj.getString("bloggername") + "\t" + obj.getString("postdate")+ "\t" + obj.getString("title")+ "\t" + obj.getString("link"));
			}
			

		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("인코딩 실패", e);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
        ArrayList<String> list = blogSearch(text);
        for(String str : list) {
        	System.out.println(str);
        }
        writeHTML(list,text);
    }

  
}
