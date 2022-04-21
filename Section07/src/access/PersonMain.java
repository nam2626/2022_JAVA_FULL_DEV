package access;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		p.setAge(29);
		p.printPersonInfo();
	}

}
