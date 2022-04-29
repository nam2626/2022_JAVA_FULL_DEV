package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello World");
		System.out.println(str);
		str.append(100);
		System.out.println(str);
		str.append("JAVA");
		System.out.println(str);
		str.replace(0, 5,"TEST");
		System.out.println(str);
		str.delete(5, 10);
		System.out.println(str);
		
	}

}
