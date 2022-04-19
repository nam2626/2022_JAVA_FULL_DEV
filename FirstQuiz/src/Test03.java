import java.util.Scanner;

public class Test03 {
	/*
	 * 숫자 하나를 입력 받아서 해당 숫자가 완전수 인지 체크하는 프로그램을 작성하세요.

		※ 완전수란 숫자의 약수들 중 자기 자신을 제외한 약수들의 합이 자기 자신과 동일한 숫자 입니다. 

   		6의 약수 : 1 2 3   --> 약수들의 합이 자기 자신과 같음, 완전수임
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0)
				sum += i;
		}
		if(num == sum)
			System.out.println("입력하신 숫자는 완전수 입니다.");
		else
			System.out.println("입력하신 숫자는 완전수가 아닙니다.");
	}

}





