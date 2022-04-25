package vo;

public class StudentVO {
	private String studentNo;
	private String name;
	private String major;
	private double score;
	
	public StudentVO(String studentNo, String name, String major, double score) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
		this.score = score;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public void printStudentInfo() {
		System.out.println(studentNo + " " + name + " " + major + " " + score);
	}
	
}








