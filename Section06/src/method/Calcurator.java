package method;

import java.util.Scanner;

/*
 * 	method : 클래스에서 가지고 있는 기능에 해당하는 부분
 * 			 미리 만든 기능(다른 언어에서는 함수)
 * 
 *  매개변수 O X    리턴 O X
 *  
 * 
 */
public class Calcurator {
	int n1;
	int n2;
	
	//숫자 두개 입력 받아서 필드를 초기화하는 메서드
	//매개변수 X, 리턴 X
	void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
	}
	
	//필드를 전부 더한 결과값을 리턴하는 메서드
	//매개변수 X, 리턴 타입 O
	int sum() {
		int result = n1 + n2;
		return result;
	}
	//외부에서 n1,n2값을 받아와서 초기화하는 메서드
	//매개변수 O, 리턴 타입 X
	void init(int num1, int num2) {
		n1 = num1;
		n2 = num2;
	}
	
	//두개의 정수를 받아서 두 수의 뺄셈 결과를 리턴하는 메서드
	//매개변수 O, 리턴 타입 O
	int minus(int i, int j) {
		return i-j;
	}
}






