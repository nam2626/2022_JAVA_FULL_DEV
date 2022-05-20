package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class UpdateStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다...........");
		
		System.out.print("학번 입력 : ");
		String sno = sc.nextLine();
		try {
			StudentVO vo = StudentService.getInstance().selectStudent(sno);
			System.out.print("이름 입력 : ");
			vo.setSname(sc.nextLine());
			System.out.print("학과번호 입력 : ");
			vo.setMajorNo(sc.nextInt());
			sc.nextLine();
			System.out.print("평점 입력 : ");
			vo.setScore(sc.nextDouble());
			sc.nextLine();
			
			StudentService.getInstance().updateStudent(vo);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}











