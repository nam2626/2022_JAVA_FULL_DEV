package method;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("홍길동", 20);
		person.setAge(-100);
		person.printPersonInfo();
		person.eat("떡볶이");
		person.eat("냉면");
		person.eat("김밥");
		person.eat("돈까스");
		System.out.println(person.getFood());
	}

}
