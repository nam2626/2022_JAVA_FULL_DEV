
public class Operator3_1 {

	public static void main(String[] args) {
		int n1 = 5, n2 = 3;
		int result = n1++ + 5 * ++n2 + n1;
		System.out.println(result);//31
	}

}
