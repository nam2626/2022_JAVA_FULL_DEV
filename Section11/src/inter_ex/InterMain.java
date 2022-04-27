package inter_ex;

public class InterMain {

	public static void main(String[] args) {
		InterClass interClass = new InterClass();
		System.out.println(interClass.circleArea(3));
		interClass.interA();
		interClass.interB();
		
		InterA a = interClass;
		a.interA();
		InterB b = interClass;
		b.interA();
	}

}
