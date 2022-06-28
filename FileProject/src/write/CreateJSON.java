package write;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJSON {

	public static void main(String[] args) {
		//EmployeeVO 객체 3개 작성
		EmployeeVO vo1 = new EmployeeVO("1234", "김철수", "과장", "회계", 3000);
		EmployeeVO vo2 = new EmployeeVO("3332", "안영수", "사원", "총무", 1400);
		EmployeeVO vo3 = new EmployeeVO("4444", "박길수", "대리", "영업", 2500);
		
		JSONObject json1 = new JSONObject(vo1);
		JSONObject json2 = new JSONObject(vo2);
		JSONObject json3 = new JSONObject(vo3);
		System.out.println(json1);
		System.out.println(json2);
		System.out.println(json3);
		
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		JSONArray array = new JSONArray(list);
		System.out.println(array);
		JSONObject json = new JSONObject();
		json.put("resultCode", "200");
		json.put("items", array);
		System.out.println(json);
	}

}





