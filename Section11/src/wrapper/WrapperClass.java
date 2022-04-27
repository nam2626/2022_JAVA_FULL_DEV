package wrapper;

public class WrapperClass {
	//변수 타입을 Wrapper클래스로 써도 된다.
	/*
	 *  Wrapper 클래스는 primitive 변수 타입을 Reference로 바꿀때 사용하는 클래스
	 *  Wrapper       primitive
	 * 	Integer <---- int
	 *  Double  <---- double
	 *  Float   <---- float
	 *  Boolean <---- boolean
	 *  Character <-- char
	 */
	public static void main(String[] args) {
		Integer n1 = 100;
		Integer n2 = new Integer("200");
		System.out.println(n1+n2);
		//Wrapper 클래스 사용법
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123")*2);
		System.out.println(Double.parseDouble("3.1415")*7);
		
		int i1 = 100;
		//auto boxing
		Integer i2 = i1;
		//auto unboxing
		int i3 = i2;
		
		//1.5 이전 버전에서의 boxing, unboxing
		int i4 = 100;
		Object obj = i4;
		Integer i5 = (Integer) obj;
		Object val = i5;
		int i6 = (int) val;
	}

}




