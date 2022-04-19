import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		String str = "Hello World";
		//문자열을 문자형 배열로 변환해서 저장
		//	0 1 2 3 4 5 6 7 8 9 10
		//	H e l l o   W o r l d
		char[] arr = str.toCharArray();
		
		//배열에 저장된 내용을 거꾸로 뒤집어서 저장
		//dlroW olleH <-- 배열에 저장
		int start = 0;
		
		System.out.println(Arrays.toString(arr));
		//문자열 끝에 해당하는 인덱스는 배열길이 - 1 - start로 구할수 있음
		while(start < arr.length/2) {
			char temp = arr[start]; //temp에 arr[start] 글자 저장
			arr[start] = arr[arr.length-1-start]; // arr[start]에 arr[길이-1-start] 글자 저장
			arr[arr.length-1-start] = temp;       // arr[길이-1-start]에 temp 글자 저장 
			
			start++;
		}
		//배열 내용을 한번에 확인
		System.out.println(Arrays.toString(arr));
	}

}



