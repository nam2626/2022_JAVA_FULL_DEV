package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * Map
	 * 		키(Key)값을 이용해서 데이터(Value)를 저장, 삭제, 읽기, 수정
	 * 
	 */
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();
		//데이터 추가
		map.put("홍길동", new Person("홍길동", 20));
		map.put("김철수",new Person("김철수", 44));
		map.put("이영희", new Person("이영희", 35));
		map.put("박영수", new Person("박영수", 23));
		map.put("홍길동", new Person("홍길동", 60));//기존 값은 지우고 새값 저장
		
		System.out.println(map);
		System.out.println(map.get("김철수"));
		
		//전체 데이터 꺼내기
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " "+map.get(key));
		}
		
		//맵에 저장된 데이터 개수
		System.out.println(map.size());
		//맵에 해당하는 키값이 있냐?
		System.out.println(map.containsKey("홍길동"));
		//맵에 해당하는 값이 있냐?
		System.out.println(map.containsValue(new Person("홍길동",60)));
		//맵이 비어 있는지?
		System.out.println(map.isEmpty());
		//맵 내용 비우기
		//map.clear();
		
		//특정 데이터 삭제
		map.remove("홍길동");//키값도 같이 삭제
		System.out.println(map.containsKey("홍길동"));
		System.out.println(map.get("홍길동"));
	}

}








