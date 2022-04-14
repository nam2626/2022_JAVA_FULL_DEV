import java.util.Scanner;

public class Quest04 {
	/*
	 *	사용자로부터 나이를 입력 받으면
	 *  입력받은 나이가 20세 이상이면 성인 이라고 출력
	 *  입력받은 나이가 20세 미만이면 미성년자 라고 출력 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력하세요 : ");
		int n = sc.nextInt();
		
//		String result = n <= 19 ? "미성년자" : "성인";
		String result = n >= 20 ? "성인" : "미성년자";
		System.out.println(result);
	}
}







