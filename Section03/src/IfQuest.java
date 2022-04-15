import java.util.Scanner;

public class IfQuest {
	/*
	 * 숫자 하나를 입력 받아서
	 * 해당 숫자가 홀수인지 짝수인지를 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if(n % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		
	}

}




