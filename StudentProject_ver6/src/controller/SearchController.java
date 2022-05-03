package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class SearchController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생번호를 이용해서 학생정보 조회를 시작합니다.............");
		//학번입력
		System.out.print("검색할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			vo.printStudentInfo();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}








