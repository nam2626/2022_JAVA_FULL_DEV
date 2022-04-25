package step01;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개 입력하세요");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int result = A * B * C;
		System.out.println(result);
		
		int r = 1;
		while(r <= result) r *= 10;
		r /= 10;
		
		int[] arr = new int[10];
		
		while(r > 0) {
			arr[result / r]++;
			result %= r;
			r /= 10;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}







