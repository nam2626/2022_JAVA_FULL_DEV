package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class TopStudentController implements Controller {
	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().maxScoreStudent();
		
		if(list == null) {
			System.out.println("학생 데이터가 하나도 없습니다.");
			return;
		}
		
		for(StudentVO vo : list) {
			vo.printStudentInfo();
		}
	}
}




