package movie;

public class Cinema {
	private static Cinema instance = new Cinema();
	private String[] seat;

	private Cinema() {
		seat = new String[5];
	}
	
	public static Cinema getInstance() {
		if(instance == null)
			instance = new Cinema();
		return instance;
	}

	public synchronized boolean reservation(int seatNo, String name) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(seatNo < 1 || seatNo > 5) {
			System.out.println("올바른 좌석 번호를 입력하세요");
			return false;
		}
		if(seat[seatNo-1] == null) {
			seat[seatNo-1] = name;
			System.out.println(name + " 손님 "+seatNo+"좌석 예매에 성공하셨습니다.");
			return true;
		}
		System.out.println(name + " 손님 "+seatNo+"좌석 예매에 실패하셨습니다.");
		return false;
	}
	
	public void allSeatPrintInfo() {
		for(int i=0;i<seat.length;i++) {
			System.out.println(i+1 + " - " + seat[i]);
		}
	}
}





