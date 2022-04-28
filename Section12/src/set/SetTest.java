package set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	/*
	 * 	Set
	 * 		1. 중복 X
	 * 		2. 자동 정렬
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		//데이터 등록
		set.add("HTML/CSS");
		set.add("js/jQuery");
		set.add("JAVA");
		set.add("Spring");
		set.add("js/jQuery");
		set.add("Android");
		set.add("JAVA");
		
		System.out.println(set);
		
		//데이터 삭제
		set.remove("JAVA");
		System.out.println(set);
		
		//데이터 개수 조회
		System.out.println(set.size());
		//데이터 검색
		System.out.println(set.contains("Spring"));
		//데이터 존재 유무
		System.out.println(set.isEmpty());
		
		//set에 내용 비우기
		//set.clear();
		
		//전체 조회
		//1. Set의 내용을 배열로 받아서 조회
		Object[] arr = set.toArray();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println();
		//2. Iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}








