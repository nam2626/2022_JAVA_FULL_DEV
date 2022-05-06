package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	private static class ServerWorker extends Thread {
		private Socket client;
		private BufferedReader br;
		private PrintWriter pw;

		public ServerWorker(Socket client) {
			this.client = client;
			try {
				pw = new PrintWriter(client.getOutputStream());
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				while (true) {
					String str = br.readLine();
					if(str == null || str.equals("exit")) break;
					broadCasting(client.getInetAddress() + "님의 메세지 : " + str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				list.remove(this);
				System.out.println(client.getInetAddress() + "님이 접속종료하셨습니다.");
				broadCasting(client.getInetAddress() + "님이 접속종료하셨습니다.");
				try {
					if(br != null)br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//담당하는 클라이언트에게만 메세지를 보내는 부분
		public void sendMessage(String msg) {
			pw.println(msg);
			pw.flush();
		}

	}
	//모든 클라이언트에게 메세지 보내는 부분
	public static void broadCasting(String msg) {
		for(int i=0;i<list.size();i++)
			list.get(i).sendMessage(msg);
	}
	
	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			server = new ServerSocket(1234);

			while (true) {
				Socket client = server.accept();
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.println(client.getInetAddress() + " 님이 접속하셨습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
