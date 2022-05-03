package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class RegisterController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 등록을 시작합니다...........");

		try {
			// 학생정보 입력
			System.out.print("학번 : ");
			String studentNo = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("학과 : ");
			String major = sc.nextLine();
			System.out.print("평점 : ");
			double score = sc.nextDouble();
			sc.nextLine();// 엔터를 지움 
			StudentService.getInstance().registerStudent(
					new StudentVO(studentNo, name, major, score));
			System.out.println("학생정보 등록 완료");
		
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("점수를 잘못 입력했습니다.");
		}
		
		
	}
}







