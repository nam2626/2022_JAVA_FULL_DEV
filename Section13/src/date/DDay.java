package date;

import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		Date start = new Date(122,3,29);
		Date end = new Date(122,10,17);
		long diff = end.getTime() - start.getTime();
		System.out.println(diff / (1000 * 60 * 60 * 24));
	}

}
