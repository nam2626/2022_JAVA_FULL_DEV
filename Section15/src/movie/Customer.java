package movie;

import java.util.Random;

public class Customer extends Thread{
	private String name;
	private int seat;
	
	public Customer(String name) {
		super();
		this.name = name;
		Random r = new Random();
		seat = r.nextInt(5)+1;
	}
	
	@Override
	public void run() {
		Cinema.getInstance().reservation(seat, name);
	}
	
}




