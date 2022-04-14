import java.util.Scanner;

public class Quest03 {
	/*
	 * 	정수하나를 입력 받은 후
	 *  입력 받은 정수가 홀수이면 홀수라고 출력, 짝수면 짝수라고 출력
	 *  
	 *  % == 삼항 String int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력하세요 : ");
		int n = sc.nextInt();

//		String result = n % 2 == 0 ? "짝수" : "홀수";
//		System.out.println(result);
		
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
	}

}






