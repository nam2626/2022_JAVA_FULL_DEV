
public class DoWhile {
	/*
	 * do - while
	 *		유일하게 선처리 후검사 방식을 취함
	 *		처음 조건이 거짓이더라도 한번은 반드시 실행을 해줌 
	 */
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println("Hello World");
			i++;
		}while(i<5);
	}

}
