package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class UpdateController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다............");
		System.out.print("수정할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);
		
		if(vo == null) {
			System.out.println("입력한 학번에 해당하는 학생이 없습니다.");
			return;
		}
		
		System.out.print("수정할 이름 : ");
		vo.setName(sc.nextLine());
		System.out.print("수정할 학과 : ");
		vo.setMajor(sc.nextLine());
		System.out.print("수정할 평점 : ");
		vo.setScore(sc.nextDouble());
		sc.nextLine();
		
	}
}







