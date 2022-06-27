package read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONQuest2 {

	public static void main(String[] args) {
		File file = new File("city.list.json");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String r = new String();
			while(true) {
				String s = br.readLine();
				if(s == null) break;
				r += s;
			}
			
			JSONArray array = new JSONArray(r);
			System.out.println(r);
			for(int i=0;i<array.length();i++) {
				JSONObject obj = array.getJSONObject(i);
				if(obj.getString("country").equals("KR")) {
					JSONObject coord = obj.getJSONObject("coord");
					System.out.println(obj.get("id") + " " + obj.get("name")
					+ " " + obj.get("state") + " " + obj.get("country") 
					+ " (" + coord.get("lon") + "," + coord.get("lat") +")" );
				}
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




