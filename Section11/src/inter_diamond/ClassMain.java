package inter_diamond;

public class ClassMain {

	public static void main(String[] args) {
		ClassF f = new ClassF();
		f.methodA();
		f.methodB();
		f.methodC();
		f.methodD();
		f.method1();
		
		System.out.println(f instanceof A);
		System.out.println(f instanceof B);
		System.out.println(f instanceof C);
		System.out.println(f instanceof D);
	}

}
