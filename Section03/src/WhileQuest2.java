
public class WhileQuest2 {
	/*
	 * 1~100까지의 숫자들 중
	 * 5와 7의 배수를 출력하시오.
	 * 단 5와 7의 공배수는 한번만 출력되게끔 하시오
	 */
	public static void main(String[] args) {
		int i = 1;
		
		while(i<101) {
			if(i % 5 == 0 || i % 7 == 0)
				System.out.println(i);
			i++;
		}
	}

}


