package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	
	private static class ServerWorker extends Thread{
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

		}
		public void sendMessage(String msg) {}
		
	}
	public static void main(String[] args) {
		
	}

}
