package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import service.StudentService;

public class SelectSchoolScholarshipController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<HashMap<String, Object>> list = 
				StudentService.getInstance().selectStudentScholarship();
		
		for(int i=0;i<list.size();i++) {
			HashMap<String, Object> map = list.get(i);
			System.out.println(map.get("sno") + " " + map.get("sname") 
			+ " " + map.get("major_name") + " " + map.get("price"));
		}
	}

}









