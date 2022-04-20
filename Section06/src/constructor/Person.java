package constructor;

public class Person {
	//이름
	String name;
	//나이
	int age;
	//성별 - true - 남자, false - 여자
	//boolean gender; 
	//성별 - 0 - 남자, 1 - 여자
	byte gender;
	
	/*
	 * 생성자 : 클래스를 생성할때 제일 먼저 한번만 실행되는 기능
	 * 		   메서드 명이 클래스명으로 되어있고, 리턴타입이 없음
	 * 		   객체가 생성될때 제일먼저 해야될 일을 작성하는 부분
	 */
	//기본생성자(default constructor)
	Person(){
		System.out.println("Person 기본 생성자 호출");
		name = "홍길동";
		age = 20;
		gender = 0;
	}
	//해당 생성자는 실행할려면 반드시 문자열을 보내줘야됨
	Person(String n){
		System.out.println("Person(String) 생성자 호출");
		name = n; //외부에서 받아온 문자열을 name에 저장
	}
	//나이를 받아서 저장하는 생성자를 작성
	Person(int i) {
		System.out.println("Person(int) 생성자 호출");
		age = i;
	}
	
	Person(String n,int a) {
		System.out.println("Person(String, int) 생성자 호출");
		name = n;
		age = a;
	}
	
}











