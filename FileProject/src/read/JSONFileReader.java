package read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONFileReader {

	public static void main(String[] args) {
		File file = new File("data.json");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String result = new String();
			while(true) {
				String s = br.readLine();
				if(s == null) break;
				result+=s;
			}
			System.out.println(result);
			//JSON으로 변환해서 출력
			JSONArray arr = new JSONArray(result);
			System.out.println(arr.length());
			for(int i=0;i<arr.length();i++) {
				//System.out.println(arr.get(i));
				JSONObject obj = arr.getJSONObject(i);
				System.out.println(obj.get("id") + " " + obj.get("first_name") + " " 
				+ obj.get("last_name") + " " + obj.get("email") + " "+
						obj.get("gender") +" "+ obj.get("ip_address"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null)fr.close();
				if(br != null)br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}







