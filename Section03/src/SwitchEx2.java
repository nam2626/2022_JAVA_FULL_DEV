import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		System.out.println("1.블랙커피");
		System.out.println("2.설탕커피");
		System.out.println("3.밀크커피");
		System.out.print("원하는 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		switch(no) {
		case 3:
			System.out.println("프림 추가");
		case 2:
			System.out.println("설탕 추가");
		case 1:
			System.out.println("커피 추가");
			System.out.println("물 추가");
		}
	}

}








