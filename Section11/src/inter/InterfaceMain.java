package inter;

public class InterfaceMain {
	public static void eat(Eat e) {
		e.eat();
	}
	public static void main(String[] args) {
		Person p = new Person();
		Dog d = new Dog();
		p.eat();
		d.eat();
		System.out.println(p instanceof Eat);
		System.out.println(d instanceof Eat);
		eat(p);
		eat(d);
	}

}
