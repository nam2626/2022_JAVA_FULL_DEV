package job;

public class JobInfo {
	private static JobInfo instance = new JobInfo();
	private String jobInfo;
	
	public JobInfo() {	}

	public static JobInfo getInstance() {
		if(instance == null)
			instance = new JobInfo();
		return instance;
	}
	
	public synchronized String getJobInfo() throws InterruptedException {
		String msg = null;
		if(jobInfo == null)
			wait();//스레드 대기 상태로 만듬
		msg = jobInfo;
		jobInfo = null;
		return msg;
	}
	
	public synchronized void writeJob(String job) {
		jobInfo = job;
		notifyAll();
	}
	
	
}






