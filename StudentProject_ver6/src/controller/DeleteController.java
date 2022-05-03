package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번을 입력하세요 : ");
		String studentNo = sc.nextLine();
		
		if(StudentService.getInstance().deleteStudent(studentNo)) {
			System.out.println("학생 정보가 정상적으로 삭제 되었습니다.");
			StudentService.getInstance().updateFile();
		}else
			System.out.println("삭제할 학생 정보가 없습니다.");
			
	}
}









