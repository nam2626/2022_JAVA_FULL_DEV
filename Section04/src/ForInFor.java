
public class ForInFor {

	public static void main(String[] args) {
		for(int dan = 2;dan < 10;dan++) {
			System.out.println("- " + dan + "단 -");
			for(int i = 1;i < 10;i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
			
		}
	}

}
