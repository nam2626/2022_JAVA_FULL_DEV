package vo;

public class MajorVO {
	private int majorNo;
	private String majorName;
	public MajorVO(int majorNo, String majorName) {
		super();
		this.majorNo = majorNo;
		this.majorName = majorName;
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
	@Override
	public String toString() {
		return majorNo + "," + majorName;
	}
	
	
}
