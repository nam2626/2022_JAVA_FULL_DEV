package abstract_method;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		animal = new Person();
		animal.eat();
		
	}

}
