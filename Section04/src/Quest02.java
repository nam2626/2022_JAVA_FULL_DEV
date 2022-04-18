import java.util.Scanner;

public class Quest02 {
	/*
	 * 	영화 평점 1~5까지의 정수를 받은 후
	 *  입력 받은 평점 만큼 ★을 출력하시오
	 *  평점 및 별 출력 후 프로그램이 종료
	 *  
	 *  이번 영화의 평점을 입력 하세요 : 3
	 *  평점 : ★★★
	 *  
	 *  이번 영화의 평점을 입력 하세요 : 6
	 *  평점은 1~5 사이만 입력할 수 있습니다.
	 *  이번 영화의 평점을 입력 하세요 : 3
	 *  평점 : ★★★
	 * 
	 *  str += "★"; 	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이번 영화의 평점을 입력 하세요 : ");
			int star = sc.nextInt();
			if(star > 5 || star < 1) {
				System.out.println("평점은 1~5 사이만 입력할 수 있습니다.");
				continue;
			}
			
			String str = "";
			for(int i=0;i<star;i++) {
				str += "★";
			}
			System.out.println("평점 : "+str);
			
			break;
		}
	}

}













