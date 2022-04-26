package final_method;

public class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
	}
	
	public final void printAnimalInfo() {
		System.out.println("이 동물의 나이 : "+age);
	}
}
