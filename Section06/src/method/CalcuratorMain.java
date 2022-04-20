package method;

public class CalcuratorMain {

	public static void main(String[] args) {
		Calcurator cal = new Calcurator();
		//cal.inputNumber();
		cal.init(10, 20);
		System.out.println(cal.sum());
		System.out.println(cal.minus(7, 8));
	}

}
