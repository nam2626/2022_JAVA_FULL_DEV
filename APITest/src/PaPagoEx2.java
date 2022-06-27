import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class PaPagoEx2 {
	public static String papagoTranslate(String target, String text) {
		String clientId = "_1rIIr0u6hwdD4VpqYnd";
        String clientSecret = "k5ERzutCdQ";
        String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
        DataOutputStream dos = null;
        BufferedReader br = null;
        HttpURLConnection con = null;
        try {
			text = URLEncoder.encode(text,"UTF-8");
			
			URL url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			String postParams = "source=ko&target="+target+"&text=" + text;
			
			con.setDoOutput(true);
			dos = new DataOutputStream(con.getOutputStream());
			dos.writeBytes(postParams);
			dos.flush();
			dos.close();
			
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

		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("인코딩 실패", e);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return null;
	}
	public static void main(String[] args) {
        papagoTranslate("en", "지금은 장마기간 입니다.");
    }

  
}
