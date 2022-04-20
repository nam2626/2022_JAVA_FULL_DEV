package field;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student();
		std.studentNo = "2009413211";
		std.name = "홍길동";
		std.major = "컴퓨터공학과";
		std.score = 3.25;
		
		System.out.println(std.studentNo + " " + std.name + " " + std.major + " " + std.score);
	}

}
