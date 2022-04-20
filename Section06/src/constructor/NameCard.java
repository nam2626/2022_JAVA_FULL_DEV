package constructor;

public class NameCard {
	//이름
	String name;
	//회사명
	String company;
	//연락처
	String tel;
	//이메일
	String email;
	//직급
	String position;
	//주소
	String address;
	public NameCard() {	}
	public NameCard(String name, String company, String tel) {
		super();
		this.name = name;
		this.company = company;
		this.tel = tel;
	}
	public NameCard(String name, String company, String tel, String email, String position, String address) {
		super();
		this.name = name;
		this.company = company;
		this.tel = tel;
		this.email = email;
		this.position = position;
		this.address = address;
	}
	
	
	
}







