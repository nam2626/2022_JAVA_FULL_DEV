package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class RegisterController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 등록을 시작합니다...........");

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
		
	}
}







