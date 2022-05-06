package step02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoMultiServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(1234);
			System.out.println("서버 오픈 완료");
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속했습니다.");
				ServerWoker worker = new ServerWoker(client);
				worker.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







