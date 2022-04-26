package instance_of;

public class InstanceOfMain {
	public static void run(Animal a) {
		if(a instanceof Person) {
			Person p = (Person) a;
			p.printPerson();
		}
		if(a instanceof Dog) {
			((Dog) a).printDog();
		}
		
			
	}
	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p;
		Person s = (Person) a;
		
		a = s;
//		Dog g = (Dog) a;
		
		System.out.println(a instanceof Person);
		System.out.println(a instanceof Dog);
		System.out.println(p instanceof Animal);
		System.out.println(p instanceof Object);
		run(p);
		run(new Dog());
		System.out.println("프로그램 종료");
		
	}

}

