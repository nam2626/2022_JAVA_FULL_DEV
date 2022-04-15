import java.util.Scanner;

public class WhileQuest1 {
	/*
	 * 정수 하나를 입력 받아서
	 * 입력 받은 정수 개수 만큼 Hello World 출력
	 * 
	 * 숫자 입력 : 5
	 * Hello World 
	 * Hello World 
	 * Hello World 
	 * Hello World 
	 * Hello World 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >>> ");
		int count = sc.nextInt();
				
		while(count != 0) {
			System.out.println("Hello World");
			count--;
		}
	}

}












