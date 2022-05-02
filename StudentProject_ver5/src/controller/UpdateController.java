package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class UpdateController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다............");
		System.out.print("수정할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			System.out.print("수정할 이름 : ");
			vo.setName(sc.nextLine());
			System.out.print("수정할 학과 : ");
			vo.setMajor(sc.nextLine());
			System.out.print("수정할 평점 : ");
			vo.setScore(sc.nextDouble());
			sc.nextLine();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("평점은 실수로 입력하세요");
		}
		
	
		
	}
}







