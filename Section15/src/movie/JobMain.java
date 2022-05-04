package movie;

import java.util.Scanner;

import job.JobManager;
import job.JobSeeker;

public class JobMain {

	public static void main(String[] args) {
		JobSeeker[] arr = new JobSeeker[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new JobSeeker("구직자"+i);
			arr[i].start();
		}
		
		Scanner sc = new Scanner(System.in);
		JobManager manager = new JobManager();
		for(int i=0;i<10;i++) {
			System.out.print("직업 정보 입력>");
			String str = sc.nextLine();
			manager.writeJobManage(str);
		}
	}

}









