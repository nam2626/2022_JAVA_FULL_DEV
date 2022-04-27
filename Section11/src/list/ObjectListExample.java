package list;

import java.util.ArrayList;

public class ObjectListExample {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		//Person 4개 생성해서 list에 추가
		list.add(new Person("홍씨", 20));
		list.add(new Person("김씨", 31));
		list.add(new Person("박씨", 41));
		list.add(new Person("이씨", 22));
		
		//김씨, 31세인 데이터가 있는지 확인
		System.out.println(list.contains(new Person("김씨", 31)));
		System.out.println();
		//김씨, 31세인 데이터 삭제
		System.out.println(list.remove(new Person("김씨", 33)));
		
	}

}




