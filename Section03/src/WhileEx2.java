
public class WhileEx2 {
	/*
	 * 	1~100까지 숫자를 더한 결과를 출력
	 * 
	 */
	public static void main(String[] args) {
		int i = 1, total = 0;
		while(i<100) {
			total += i;
			i++;
		}
		System.out.println(total);
	}

}
