package inter_diamond;

public interface D extends B, C{
	public void methodD();
	
	@Override
	default void method1() {
		B.super.method1();
		C.super.method1();
	}
	
}
