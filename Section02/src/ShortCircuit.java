
public class ShortCircuit {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		//단락회로 : AND나 OR 연산시 앞에있는 조건의 결과가 
		//         이미 true나 false로 결정이 된경우에는 뒤에 있는 연산을 생략
		boolean result = n1 != 10 && ++n2 == 10;
		System.out.println(result);
		System.out.println(n2);
		
		result = n1 < 5 || ++n2 > 20;
		System.out.println(result);
		System.out.println(n2);
		
	}

}
