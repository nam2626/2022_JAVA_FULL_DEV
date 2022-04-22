package static_ex;

public class Count {
	private int count = 0;
	public static int total_count = 0;
	private static String str = "";
	public Count() {
		count++;
		total_count++;
		str += "★";
		System.out.println(count + " " + total_count);
	}
	
	public static String getStr() {
		return str;
	}
	public void addStaticCount() {
		//non-static은 static에 언제든지 접근이 가능
		//non-static이 실행되는 시점에서는 static 이미 메모리에 생성 되어있다.
		total_count++;
	}
	public static void addFieldCount() {
		//count++;
		//static은 non-static에 접근이 불가능
		//static이 사용하는 시점에 non-static은 생성되지 않을 수도 있고
		//어떤 객체의 대상인지 구분이 불가능하다.		
	}
}





