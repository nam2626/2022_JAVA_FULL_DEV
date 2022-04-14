
public class Operator5 {
	/*
	 *  논리 연산자 : 조건식을 두개이상 사용하거나, 조건식의 결과를 반대로 뒤집을때
	 *  	AND  -->  &&
	 *  	OR	 -->  ||
	 *  	NOT	 -->  !
	 */
	public static void main(String[] args) {
		int n1 = 10, n2 = 5;
		
		// AND 연산 : 조건식1 && 조건식2 ---> 양쪽의 조건식이 둘다  true 일때만 true가 되는 연산자
		//                  true      true
 		System.out.println(n1 > 5 && n2 < 10);
 		//                  true      false
 		System.out.println(n1 > 5 && n2 > 10);
 		//                  true      true        true
 		System.out.println(n1 > 5 && n2 < 10 && n1 != n2);
 		
 		// OR 연산 : 조건식1 || 조건식2 ---> 조건식들 중 하나라도 true면 true가 되는 연산자 
 		System.out.println(n1 < 5 || n2 > 10);
 		System.out.println(n1 < 5 || n2 < 10);
 		System.out.println(n1 < 5 || n2 < 10 || n1 == n2);
 		
 		// NOT 연산 : !조건식 --> true -> false, false -> true
 		System.out.println(!(n1 < 5));
 		boolean result = n1 > 5;
 		System.out.println(!result);
	}

}





