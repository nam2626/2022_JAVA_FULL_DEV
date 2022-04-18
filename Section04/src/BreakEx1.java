
public class BreakEx1 {
	/*
	 * break
	 * 	 break를 직접 감싸고 있는 반복문 하나만 종료
	 */
	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while(true) {
			sum += i;
			i++;
			if(sum > 5000) {
				break;//반복문을 종료
			}
		}
		System.out.println(sum);
	}

}
