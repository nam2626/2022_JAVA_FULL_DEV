package inheritance_01;

public class Person extends Animal{

	public Person() {
		System.out.println("Person 생성자");
	}
	
	public void run() {
		System.out.println("사람이 달립니다.");
	}
	
	public void printAge() {
		System.out.println("이 사람의 나이 : "+age);
	}

}
