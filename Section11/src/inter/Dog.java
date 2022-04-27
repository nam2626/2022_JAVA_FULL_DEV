package inter;

public class Dog implements Eat{

	@Override
	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}

}
