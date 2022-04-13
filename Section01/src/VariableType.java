
public class VariableType {
	/*
	 * 	변수 타입
	 * 		정수형: byte(1) short(2) int(4) long(8)
	 * 		실수형: float(4)	double(8)
	 * 		문자형: char(2)
	 * 		논리형: boolean(1)
	 * 
	 */
	public static void main(String[] args) {
		long l = 100L; //100은 long 타입 데이터
		System.out.println(l);
		
		double d = 3.1415;
		System.out.println(d);
		float f = 3.1415f;
		System.out.println(f);
		
		char ch = 'A';
		int n1 = ch;
		System.out.println(ch);
		System.out.println(n1);
		
		ch = 'a';
		n1 = ch;
		System.out.println(ch);
		System.out.println(n1);
		
		ch = ' ';
		n1 = ch;
		System.out.println(ch);
		System.out.println(n1);
		
		ch = '가';
		n1 = ch;
		System.out.println(ch);
		System.out.println(n1);
		
		boolean b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
	}

}





