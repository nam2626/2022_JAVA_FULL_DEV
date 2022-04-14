
public class Overflow {

	public static void main(String[] args) {
		//byte --> 최대값 127, 최소값 -128
		//byte b = 128; 직접적으로 최대값 최소값을 벗어나는 값은 넣을 수 없음
		byte b = 127;
		System.out.println(b);
		b++;//b에 저장된 값을 1 증가
		System.out.println(b);
		b--;//b에 저장된 값을 1 감소
		System.out.println(b);
	}

}
