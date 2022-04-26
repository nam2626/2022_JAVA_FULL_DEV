package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class TopStudentController extends Controller {
	@Override
	public void execute(Scanner sc) {
		StudentVO vo = StudentService.getInstance().maxScoreStudent();
		
		if(vo == null)
			System.out.println("학생 데이터가 하나도 없습니다.");
		else
			vo.printStudentInfo();
	}
}
