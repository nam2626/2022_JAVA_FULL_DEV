
public class WhileInWhile {

	public static void main(String[] args) {
		int dan = 2;
		int i = 1;
		while(dan < 10) {
			System.out.println("- " + dan + "단 -");
			i=1;//중첩된 반복문을 실행하지 전에 제어 변수 초기화 
			while(i < 10) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
			dan++;
		}
	}

}
