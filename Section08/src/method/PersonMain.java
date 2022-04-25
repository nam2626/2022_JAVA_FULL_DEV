package method;

public class PersonMain {
	//p는 메모리 주소를 받기 떄문에
	//레퍼런스 형은 원본에 접근해서 값을 변경할 수 있다.
	public static void addAge(Person p) {
		p.setAge(p.getAge()+10);
	}
	//고정형 형태의 변수는 값을 복사 받기때문에
	//원본에 접근할 수가 없다. 원본값을 변경할수 없다.
	public static void add(int num) {
		num += 10;
	}
	public static void main(String[] args) {
		Person s = new Person("홍길동", 20);
		System.out.println(s.toString());
		addAge(s);
		System.out.println(s.toString());
		
		int a = 100;
		add(a);
		System.out.println(a);
	}

}




