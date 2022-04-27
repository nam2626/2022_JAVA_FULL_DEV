package inter_diamond;

public class ClassF implements D{

	@Override
	public void methodB() {
		System.out.println("B");
	}

	@Override
	public void methodA() {
		System.out.println("A");
	}

	@Override
	public void methodC() {
		System.out.println("C");
	}

	@Override
	public void methodD() {
		System.out.println("D");
	}

}
