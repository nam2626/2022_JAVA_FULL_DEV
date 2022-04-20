package constructor;

public class Student {
	String studentNo;
	String name;
	String major;
	double score;
	
	//생성자 - 학번, 이름, 학과, 평점
	Student(String s, String n, String m, double sc){
		studentNo = s;
		name = n;
		major = m;
		score = sc;
	}
}
