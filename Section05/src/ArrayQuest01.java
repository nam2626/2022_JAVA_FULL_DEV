import java.util.Scanner;

public class ArrayQuest01 {
	/*
	 * 	정수형 배열 길이가 7인 배열을 생성한 뒤에
	 *  배열에 숫자를 전부 사용자로부터 입력을 받아서 저장 후
	 *  배열에 모든 값을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
	}

}




