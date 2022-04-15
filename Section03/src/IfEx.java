
public class IfEx {
	/*
	 * 		if문은 조건식이 true면 
	 * 		if문 아래있는 {실행문 영역}에 있는 코드를 실행
	 * 		조건식이 false면 해당 if문을 건너뜀
	 * 
	 * 		if( 조건식 ){
	 * 			실행할 코드1
	 * 			실행할 코드2
	 * 			실행할 코드3
	 * 		}
	 */
	public static void main(String[] args) {
		int n = 10;
		
		if(n > 0) {
			System.out.println("n은 양수 입니다.");
		}
		
		if(n < 0) {
			System.out.println("n은 음수 입니다.");
		}
		
		if(n == 0) {
			System.out.println("n은 0 입니다.");
		}
		System.out.println("프로그램 종료");
	}

}





