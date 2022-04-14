
public class ShortCircuit {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		
		boolean result = n1 != 10 && ++n2 == 10;
		System.out.println(result);
		System.out.println(n2);
		
		result = n1 > 5 || ++n2 > 20;
		System.out.println(result);
		System.out.println(n2);
		
	}

}
