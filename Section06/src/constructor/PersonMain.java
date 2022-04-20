package constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		Person p2 = new Person("김철수");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		Person p3 = new Person(30);
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.gender);
		Person p4 = new Person("김철수", 30);
		System.out.println(p4.name);
		System.out.println(p4.age);
		System.out.println(p4.gender);
	}

}





