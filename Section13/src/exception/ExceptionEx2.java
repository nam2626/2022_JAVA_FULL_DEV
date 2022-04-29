package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5 / 3);
			System.out.println(2);
			int[] arr = { 1, 2, 3 };
			arr[3]++;
			System.out.println(3);
		}catch (ArithmeticException e) {
			System.out.println(4);
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(5);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(6);
	}

}

