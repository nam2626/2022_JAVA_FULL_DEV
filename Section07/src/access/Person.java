package access;
/*
 * 	접근제어자(Access Modifier)
 * 		private : 클래스 내부에서만 접근이 가능(외부 접근 X)
 * 		protected : 해당 클래스를 상속 받은 클래스만 접근이 가능(외부 접근 X)
 * 		default : 같은 패키지 내에서는 접근이 가능
 * 		public : 누구나 접근이 가능(외부 접근 O)
 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printPersonInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}









