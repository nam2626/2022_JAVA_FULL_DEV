package aircon;

import java.util.Scanner;

public class AirconMain {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 - 에어컨 전원");
			System.out.println("2 - 온도 증가");
			System.out.println("3 - 온도 감소");
			System.out.println("4 - 바람세기");
			System.out.println("5 - 운전선택");
			System.out.println("0 - 프로그램 종료");
			System.out.print("원하시는 번호를 선택하세요 : ");
			int command = sc.nextInt();
			if(command == 0) break;
			aircon.remote(command);
		}
		System.out.println("프로그램 종료");
	}

}






