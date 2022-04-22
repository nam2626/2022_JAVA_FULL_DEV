package static_ex;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("홍길동");
		Card c2 = new Card("김철수");
		Card c3 = new Card("이영희");
		Card c4 = new Card("박영수");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
	}

}
