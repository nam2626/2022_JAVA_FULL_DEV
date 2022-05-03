package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			//메뉴 출력
			System.out.println("---- 학생정보관리 프로그램 ----");
			System.out.println("1. 학생정보등록");
			System.out.println("2. 학생정보조회");
			System.out.println("3. 학생정보수정");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 학생정보 전체조회");
			System.out.println("6. 전체 석차 1등 조회");
			System.out.println("0. 프로그램 종료");
			//메뉴 번호 입력
			System.out.print("원하시는 메뉴번호를 입력하세요 > ");
			int no = sc.nextInt();
			sc.nextLine();
			if(no == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null)
				controller.execute(sc);
		}
	}

}









