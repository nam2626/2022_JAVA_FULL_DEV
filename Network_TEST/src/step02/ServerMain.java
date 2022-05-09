package step02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		DataInputStream dis = null;
		PrintWriter pw = null;		
		try {
			server = new ServerSocket(9999);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			dis = new DataInputStream(client.getInputStream());
			int num = dis.readInt();
			String result = "";
			Random r = new Random();
			
			for(int i=1;i<num;i++) {
				if(num % i == 0)
					result += i + "\t";
			}
			result += num;
			pw.println(result);			
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis != null)dis.close();
				if(pw != null)pw.close();
				if(server != null )server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
