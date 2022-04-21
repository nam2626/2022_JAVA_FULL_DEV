
public class Test04 {
	/*
	 * 1~100까지의 정수들 중 4와 7의 배수를 출력하시오

		단 4와 7의 공배수는 한번만 출력하시오.

	 */
	public static void main(String[] args) {
		for(int i=1;i<101;i++) {
			if(i % 4 == 0 || i % 7 == 0)
				System.out.println(i);
		}
	}

}
