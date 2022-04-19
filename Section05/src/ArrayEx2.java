
public class ArrayEx2 {

	public static void main(String[] args) {
		//배열 생성과 동시에 초기화 방법
		//정수형 배열 5개짜리로 선언 - 순서대로 초기화
		//            0 1 2 3 4
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3,4,5,6};
		
		//배열에 있는 내용을 전부 출력
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println("배열의 길이 : "+arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}




