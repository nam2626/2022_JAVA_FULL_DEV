
public class Operator1 {
	/*
	 * 		사칙연산
	 * 			덧셈		+
	 * 			뺄셈		-
	 * 			곱셈		*
	 * 			나눗셈	/   <--- 몫(정수), 소수점(실수)
	 * 			나눗셈   %    <--- 나머지(정수)
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언, 변수명은 자유롭게
		//초기화는 각각 5, 3으로 변수를 초기화
		int n1 = 5, n2 = 3;
		//정수와 정수를 계산하면 결과값으로 정수가 나옴
		System.out.println(n1 + n2); //8
		System.out.println(n1 - n2); //2
		System.out.println(n1 * n2); //15 
		System.out.println(n1 / n2); //1
		System.out.println(n1 % n2); //2
		
		//계산한 결과를 변수에 저장
		int result = 0;
		result = n1 + n2; //n1과 n2의 계산된 결과값을 result에 저장, n1,n2 값은 변경사항 없음
		System.out.println(result);
		result = n1 * n2;
		System.out.println(result);//15
		
		double d = 12.456;
		//정수와 실수를 계산하면 정수가 실수로 형변환이 됨
		System.out.println(n1 * d);
		System.out.println(d / n1);
		
		System.out.println((int)(1.5 * 3));
		System.out.println((int)1.5 * 3);
	}

}





