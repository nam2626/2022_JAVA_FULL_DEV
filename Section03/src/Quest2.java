import java.util.Scanner;

public class Quest2 {
	/*
	 * 	정수형 변수 3개 선언하여
	 *  정수 3개를 입력 받아서 저장한 뒤에
	 *  입력한 정수들 중 제일 큰 값을 출력하시오 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("정수2를 입력하세요 : ");
		int n2 = sc.nextInt();
		System.out.print("정수3를 입력하세요 : ");
		int n3 = sc.nextInt();
		
		int max;
		if(n1 > n2) {
			max = n1;
		}else {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println(max);
	}

}







