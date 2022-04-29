package date;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date start = new Date(1);
		System.out.println(start);
		Date date = new Date(120, 0, 1);
		System.out.println(date);
		System.out.println(date.getTime());
		Date date1 = new Date(120, 11, 31);
		System.out.println(date1);
	}

}






