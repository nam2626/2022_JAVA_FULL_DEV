package job;

public class JobSeeker extends Thread {

	public JobSeeker(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(getName() + "가 직업 정보 수신을 대기중입니다.");
				String msg = JobInfo.getInstance().getJobInfo();
				if(msg != null) {
					System.out.println(msg + "는 "+ getName() +"님이 수신하였습니다.");
					System.out.println(getName() + " 구직자 지원 종료");
					return;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}


