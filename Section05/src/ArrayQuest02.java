import java.util.Scanner;

public class ArrayQuest02 {
	/*
	 * 정수형 배열 길이가 10개인 배열을 생성한 후 
	 * 정수를 입력받아서 배열에 각 요소에 전부 입력을 한 후
	 * 배열에 있는 값들 중 제일 큰값, 제일 작은값을 출력 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		//배열에 정수 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		//최대값 최소값 저장할 변수를 선언하고 초기화
		int max, min;
		max = min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			//max에 저장된 값이 배열 요소보다 작으면 배열 요소값을 max에 저장
			//max에는 큰 값만 저장한다.
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}







