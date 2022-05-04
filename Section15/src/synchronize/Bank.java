package synchronize;

public class Bank {
	private static Bank instance = new Bank();
	private int money;
	
	private Bank() {
		money = 1000;
	}
	
	public static Bank getInstance() {
		if(instance == null)
			instance = new Bank();
		return instance;
	}
	
	public synchronized int withdraw(int m) {
		money -= m;
		return money;
	}
	
}


