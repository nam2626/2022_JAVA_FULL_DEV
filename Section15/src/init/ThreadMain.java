package init;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadRun run1 = new ThreadRun("스레드1");
		ThreadRun run2 = new ThreadRun("스레드2");
		ThreadRun run3 = new ThreadRun("스레드3");
		ThreadRun run4 = new ThreadRun("스레드4");
		ThreadRun run5 = new ThreadRun("스레드5");
		ThreadRun run6 = new ThreadRun("스레드6");
		
		run1.start();
		run2.start();
		run3.start();
		run4.start();
		run5.start();
		run6.start();
	}

}
