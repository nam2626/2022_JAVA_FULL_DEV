package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class RegisterStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {	
		System.out.println("학생정보 등록을 시작합니다...........");
		StudentVO vo = null;
		
		System.out.print("학번 입력 : ");
		String sno = sc.nextLine();
		
		try {
			vo = StudentService.getInstance().selectStudent(sno);
			while(vo != null) {
				System.out.println("학번이 중복되었습니다. 다시 입력하세요");
				System.out.print("학번 입력 : ");
				sno = sc.nextLine();
				vo = StudentService.getInstance().selectStudent(sno);
			}
		} catch (StudentException e) {
			System.out.println("학번이 중복되지 않습니다.");
		}
		System.out.print("이름 입력 : ");
		String sname = sc.nextLine();
		
		System.out.print("학과번호 입력 : ");
		int majorNo = sc.nextInt();
		sc.nextLine();
		System.out.print("평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		int result = StudentService.getInstance()
			.insertStudent(new StudentVO(sno, sname, majorNo, null, score));
		System.out.println(result);
		
	}

}








