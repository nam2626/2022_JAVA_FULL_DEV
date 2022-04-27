package inter_ex;

public interface InterA {
	//public static final 은 자동으로 붙음
	public static final double PI = 3.1415;
	
	//default method --> jdk8 부터 지원
	default double circleArea(int r) {
		return r * r * PI;
	}
	
	public void interA();
}
