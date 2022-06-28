import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherTest {
	static int timeList[] = new int[]{2,5,8,11,14,17,20,23};
    public static String getTime(){
        int time = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int i;
        for(i=0;i<timeList.length;i++){
            if(timeList[i] >= time)
                break;
        }
        if(i<3 && i != 0)
            return "0" + timeList[i-1] + "00";
        return timeList[i-1] + "00";
    }
	public static void main(String[] args) throws Exception{
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=hpOVfNem4MVro1QdBZTMTq%2FMZs%2B8yylSvxNQlqPiEQec%2Bo99WRRbIvrVqLltto5W0TmluoxR7uQHpHFNZ146qg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20220628", "UTF-8")); /*‘21년 6월 28일 발표*/
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode(getTime(), "UTF-8")); /*06시 발표(정시단위) */
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        JSONObject json = new JSONObject(sb.toString());
        JSONArray array = json.getJSONObject("response").getJSONObject("body")
        		.getJSONObject("items").getJSONArray("item");
        for(int i=0;i<array.length();i++) {
        	JSONObject obj = array.getJSONObject(i);
        	switch(obj.getString("category")) {
        	case "PN1":
        		System.out.println("1시간 강수량 : "+obj.getString("obsrValue"));
        		break;
        	case "REH":
        		System.out.println("습도 : "+obj.getString("obsrValue"));
        		break;
        	case "PTY":
        		System.out.println("강수 형태 : "+obj.getString("obsrValue"));
        		break;
        	case "T1H":
        		System.out.println("기온 : "+obj.getString("obsrValue"));
        		break;
        	case "WSD":
        		System.out.println("풍속 : "+obj.getString("obsrValue"));
        		break;
        	
        	}
        }
	}

}






