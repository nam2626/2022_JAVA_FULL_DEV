package string;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		String str1 = "Hello World";
		//저장하고 있는 문자열을 바이트형 배열로 변환
		byte[] arr = str1.getBytes();
		System.out.println(Arrays.toString(arr));
		//해당 인덱스번호에 위치한 문자 하나를 리턴
		System.out.println(str1.charAt(0));
		
		String str2 = "Hello World Hello Java World";
		//문자열 처음부터 검색
		System.out.println(str2.indexOf("World"));
		//문자열 7번 인덱스부터 검색
		System.out.println(str2.indexOf("World",7));
		//문자열 끝에서부터 검색
		System.out.println(str2.lastIndexOf("World"));
		System.out.println(str2.lastIndexOf("World",22));
		//알파벳을 전부 소문자로 변환
		System.out.println(str2.toLowerCase());
		//알파벳을 전부 대문자로 변환
		System.out.println(str2.toUpperCase());
		//문자열 길이를 리턴
		System.out.println(str2.length());
		//10번 인덱스부터 마지막까지 문자열을 잘라내서 리턴
		System.out.println(str2.substring(10));
		//10번 인덱스부터 15번 인덱스 전까지 문자열을 잘라내서 리턴
		System.out.println(str2.substring(10, 15));
		//문자열 바꾸기
		System.out.println(str2.replace("World", "Hell"));
	}

}








