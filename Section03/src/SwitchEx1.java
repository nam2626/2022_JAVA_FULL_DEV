
public class SwitchEx1 {
	/*
	 * 	switch는 case 옆에 나와는 값과 일치하면
	 *  일치하는 순간부터 switch 내부의 코드들을 전부 실행한다.(break를 만날때까지)
	 *  break는 switch를 종료 시킨다.
	 *  switch에서 비교가 가능한 값은 정수, 문자, 문자열만 가능 
	 * 	switch(값){
	 * 	case 비교값:
	 * 		코드
	 * 		[break;]
	 * 		...
	 * 	default:
	 * 		코드
	 * 	}
	 * 
	 */
	public static void main(String[] args) {
		int no = 2;
		
		switch(no) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("????");
			
		}
	}

}
