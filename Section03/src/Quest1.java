import java.util.Scanner;

public class Quest1 {
	/*
	 * 숫자 두개를 입력해서
	 * 두 숫자의 뺄셈 결과를
	 * 무조건 양수로 되게끔 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		
		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		
		System.out.println(n1 - n2);
	}

}






