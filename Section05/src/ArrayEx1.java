
public class ArrayEx1 {
	/*
	 * 	배열(Array)
	 * 		변수를 선언시 하나의 변수명으로 
	 * 		동시에 여러개의 값을 저장할 공간을 만드는 자료구조
	 * 
	 *  인덱스(Index) - 0 ~ 배열 개수 - 1
	 *  	동시에 여러개 선언된 배열의 요소들을 구분하는 번호표 
	 * 	
	 * 	변수타입[] 배열명 = new 변수타입[개수];
	 */
	public static void main(String[] args) {
		//정수형 변수 5개짜리를 선언
		int[] arr = new int[5];
		
		arr[0] = 10; //배열 arr에 0번째에 데이터 10을 저장하겠다.
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}

}

