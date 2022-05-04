package join;

public class JoinTest {

	public static void main(String[] args) {
		JoinThread j = new JoinThread("Join");
		
		j.start();
		
		try {
			//현재 스레드가 j 스레드가 끝날때까지 대기
			//밀리초가 들어가면 해당 시간까지만 대기
			j.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main thread exit");
	}

}
