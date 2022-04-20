package method;
/*
 * Person은 이름과 나이, 먹은 음식 내용을 가지고 있음
 * 생성자에서는 이름과 나이를 외부에서 받아서 초기화
 * 먹은 음식 내용은 빈문자열("")로 초기화
 */
public class Person {
	String name;
	int age;
	String food;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		food = "";
	}
	/*
	 * 	메서드(method) - 기능 작성
	 * 		리턴타입 메서드명([매개변수...]){
	 * 			실행할 코드;
	 * 			[return 결과값;]
	 * 		}
	 */
	
	/*
	 * 필드의 name과 age를 이용하여 Person의 정보를 출력
	 * 예시>
	 * 이름 : OOO
	 * 나이 : 20
	 */
	void printPersonInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}







