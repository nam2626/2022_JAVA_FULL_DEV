import java.util.Scanner;

public class Test05 {
	/*
	 * 숫자 하나를 입력 받은 후 해당 숫자가 소수인지 출력하시오
	 * 
	 * 소수 : 1과 자기 자신으로 나누어 지는 숫자
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		//1과 자기 자신으로 나누어 지는지 체크
		// ---> 2~자기자신-1 나누어서 떨어지는지 체크
		boolean result = true;//true면 소수, false면 소수가 아님
		if(n < 2) result = false;//2 미만은 소수가 아니다.
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				result = false;
				break;
			}
		}
		if(result)
			System.out.println("소수 입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}

}




