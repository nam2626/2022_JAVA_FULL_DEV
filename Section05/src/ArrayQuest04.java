import java.util.Arrays;

public class ArrayQuest04 {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		/*
		 * 배열 arr에 있는 모든 알파벳을 대문자로 변경 후 출력
		 */
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] -= 32;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
