import java.util.Scanner;

public class ForQuest1 {
	/*
	 * 숫자 두개를 입력 받은 후
	 * 입력한 숫자들 중 작은 숫자부터 큰 숫자까지의 합을 출력
	 * 
	 * 숫자 입력 : 1
	 * 숫자 입력 : 100
	 * 합 : 5050
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 두개 입력 후 변수에 저장
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		//합을 저장할 정수형 변수 선언
		int sum = 0;
		//큰숫자 작은 숫자를 구분해서 저장
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		//반복문 - 작은 숫자 부터 큰숫자까지 반복
		//	숫자를 합에다가 누적
		for(int i=n1;i<=n2;i++) 
			sum += i;
		
		//총합을 출력
		System.out.println(sum);
	}

}





