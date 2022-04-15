import java.util.Scanner;

public class SwitchQuest {
	/*
	 *  점수 하나를 입력 받아서
	 *  100~90 A 
	 *   89~80 B
	 *   79~70 C
	 *   69~60 D
	 *   59~ 0 F
	 *   성적등급을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >>> ");
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("성적 등급이 A 입니다.");
			break;
		case 8:
			System.out.println("성적 등급이 B 입니다.");
			break;
		case 7:
			System.out.println("성적 등급이 C 입니다.");
			break;
		case 6:
			System.out.println("성적 등급이 D 입니다.");
			break;
		default:
			System.out.println("성적 등급이 F 입니다.");
		}
	}

}




