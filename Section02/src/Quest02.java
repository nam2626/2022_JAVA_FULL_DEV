import java.util.Scanner;

public class Quest02 {
	/*
	 *  반지름 하나를 입력 받은 후
	 *  입력 받은 반지름 값을 이용하여 해당 원넓이를 출력
	 *  
	 *  반지름 입력 : 3
	 *  원넓이 : 28.2735
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		int r = sc.nextInt();
		System.out.println("원넓이 : "+(r*r*3.1415));
	}

}





