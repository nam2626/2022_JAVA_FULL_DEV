package single;

public class Number {
	private static Number instance = new Number();
	private int count;
	private Number() {
		System.out.println("Number 객체 생성");
		count++;
	}

	public static Number getInstance() {
		if(instance == null)
			instance = new Number();
		return instance;
	}
	
	public int getCount() {return count;}
}




