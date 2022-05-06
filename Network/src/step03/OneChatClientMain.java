package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class OneChatClientMain {
	private static class ClientWorker extends Thread{
		private Socket server;
		private BufferedReader br;
		public ClientWorker(Socket server) {
			this.server = server;
			try {
				br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					String str = br.readLine();
					if(str == null || str.equals("exit")) break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(br != null)br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Socket server = null;
		Scanner sc = null;
		PrintWriter pw = null;
		
		try {
			server = new Socket("192.168.5.101", 1234);
			sc = new Scanner(System.in);
			pw = new PrintWriter(server.getOutputStream());
			ClientWorker worker = new ClientWorker(server);
			worker.start();
			while(true) {
				System.out.println("메세지 입력 >>> ");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit")) break;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null)pw.close();
				if(sc != null)sc.close();
				if(server != null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}







