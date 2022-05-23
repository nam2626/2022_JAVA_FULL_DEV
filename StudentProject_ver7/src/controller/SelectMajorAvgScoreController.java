package controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import service.StudentService;

public class SelectMajorAvgScoreController implements Controller {

	@Override
	public void execute(Scanner sc) {
		HashMap<String, Double> map = 
				StudentService.getInstance().selectMajorAvgSocre();
		
		Set<String> key = map.keySet();
		
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k + " : " + map.get(k));
		}
	} 

}









