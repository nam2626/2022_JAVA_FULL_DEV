package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class SearchController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생번호를 이용해서 학생정보 조회를 시작합니다.............");
		//학번입력
		System.out.print("검색할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);
		
		if(vo == null)
			System.out.println("입력한 학번에 해당하는 학생이 없습니다.");
		else
			vo.printStudentInfo();
	}
}








