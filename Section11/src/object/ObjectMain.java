package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		Person s = new Person("홍길동", 20);
		
		System.out.println(p);
		System.out.println(p.toString());
		
		System.out.println(p.hashCode());
		System.out.println(s.hashCode());
		
		System.out.println(p.equals(s));
	}

}
