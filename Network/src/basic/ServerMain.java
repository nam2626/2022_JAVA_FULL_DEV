package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;		
		try {
			//1. Server Open
			server = new ServerSocket(1234);
			//2. Client Accept
			Socket client = server.accept();
			//3. Stream Init
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//4. Data Send/Receive
			String str = br.readLine();
			System.out.println(str);
			pw.println("서버에서 보낸 메세지");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//5. Close
			try {
				if(br != null)br.close();
				if(pw != null)pw.close();
				if(server != null )server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}






