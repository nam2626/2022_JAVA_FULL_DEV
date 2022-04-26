package final_class;
//final 클래스는 부모 클래스가 될수 없음
public final class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
	}
	
	public void printAnimalInfo() {
		System.out.println("이 동물의 나이 : "+age);
	}
}
