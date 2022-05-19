
package vo;

public class StudentVO {
	private String sno;
	private String sname;
	private int majorNo;	
	private String majorName;
	private double score;
	public StudentVO(String sno, String sname, int majorNo, String majorName, double score) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.majorNo = majorNo;
		this.majorName = majorName;
		this.score = score;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMajorNo() {
		return majorNo;
	}
	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return sno + "\t" + sname + "\t" + majorNo + "\t" + majorName
				+ "\t" + score;
	}
	
	
	
	
	
}
