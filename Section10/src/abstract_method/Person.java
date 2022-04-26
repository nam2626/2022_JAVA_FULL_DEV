package abstract_method;

public class Person extends Animal{

	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}

}
