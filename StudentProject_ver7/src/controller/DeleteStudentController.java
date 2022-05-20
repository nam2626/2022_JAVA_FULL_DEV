package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다...........");

		System.out.print("삭제할 학번 입력 : ");
		String sno = sc.nextLine();
		
		StudentService.getInstance().deleteStudent(sno);
	}

}
