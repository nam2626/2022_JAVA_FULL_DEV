import java.util.Scanner;

public class ForEx2 {
	/*
	 * 정수 하나 입력을 받아서
	 * 입력 받은 정수에 해당하는 구구단을 출력
	 * 
	 * 정수 입력 : 3
	 * 3 * 1 = 3
	 * 3 * 2 = 6
	 * ...
	 * 3 * 9 = 27
	 * WhileQuest3에서 작성한 While문을 For문으로 변경
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int dan = sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

}





