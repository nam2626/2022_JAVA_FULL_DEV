package movie;

public class MovieMain {

	public static void main(String[] args) {
		Customer[] arr = new Customer[7];
		arr[0] = new Customer("김씨");
		arr[1] = new Customer("이씨");
		arr[2] = new Customer("박씨");
		arr[3] = new Customer("공씨");
		arr[4] = new Customer("곽씨");
		arr[5] = new Customer("목씨");
		arr[6] = new Customer("정씨");
		
		for(Customer c : arr)
			c.start();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Cinema.getInstance().allSeatPrintInfo();
	}

}





