package constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("20091234124", "홍길동", "컴퓨터공학", 3.5);
		System.out.println(std1.studentNo);
		System.out.println(std1.name);
		System.out.println(std1.major);
		System.out.println(std1.score);
	
	}

}
