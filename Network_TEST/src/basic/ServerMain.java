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
			//클라이언트로부터 데이터를 받음
			int ea = Integer.parseInt(br.readLine());
			System.out.println(ea);
			//서버에서 수행할 작업을 처리
			int sum = 0;
			for(int i=1;i<=ea;i++) {
				if(ea % i == 0)
					sum += i;
			}
			//클라이언트에게 보냄
			pw.println(sum);
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






