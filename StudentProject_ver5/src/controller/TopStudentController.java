package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class TopStudentController implements Controller {
	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().maxScoreStudent();
		
		try {
			if(list == null) 
				throw new StudentException("학생 데이터가 하나도 없습니다.");
			
			for(StudentVO vo : list) {
				vo.printStudentInfo();
			}
		}catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
}




