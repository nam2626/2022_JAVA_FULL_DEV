
public class Casting {
	/*
	 * 데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 
	 *		자동으로 데이터 형변환
	 *			- 작은 개념이 큰 개념으로 바뀌면 자동으로 형변환
	 *				-> 정수를 실수로 바꿀때
	 *			- 메모리가 적은 타입이 메모리가 큰 타입으로 바뀔때 자동으로 형변환
	 *				-> float 타입의 데이터를 double에 저장할때
	 *
	 * 		강제로 데이터 형변환 ---> 데이터 손실이 일어날수 있음
	 * 			- 큰 개념이 작은 개념으로 바뀌어야 될때 강제로 형변환
	 * 			- 메모리가 큰 타입이 작은 타입으로 저장할때
	 * 				-> double을 float나 int에 넣을때
	 */
	public static void main(String[] args) {
		int n = 120;
		double d = n; //정수 n을 실수로 형변환 해서 d에 저장
		System.out.println(d);
		long l = n; //int형 변수 n을 long형으로 형변환해서 저장
		System.out.println(l);
		
		//강제로 형변환 하는 방법 --> (형변환할 변수타입) 값 or 변수
		double pi = -3.5415; //소수점 부분을 잘라냄
		int i = (int)pi;
		System.out.println(i);
		int t = 65;
		char ch = (char)t;
		System.out.println(ch);
		System.out.println((int)ch);
		
//		double result = 3 + 3.1415f; //자동으로 형변환이 2번 이루어짐
		double result = 3.0 + 3.1415; // 형변환이 없음
		System.out.println(result);
	}

}




