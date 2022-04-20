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
	 */
	//기본생성자(default constructor)
	Person(){
		System.out.println("Person 기본 생성자 호출");
	}
	
}



