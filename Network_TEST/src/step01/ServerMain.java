package step01;

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
			server = new ServerSocket(5000);
			Socket client = server.accept();
			dis = new DataInputStream(client.getInputStream());
			pw = new PrintWriter(client.getOutputStream());
			
			int ea = dis.readInt();
			String result = "";
			Random r = new Random();
			
			while(ea > 0) {
				HashSet<Integer> set = new HashSet<Integer>();
				while(set.size() != 6) {
					set.add(r.nextInt(45)+1);
				}
				result += ea + " set : " + set.toString() + "\t";
				ea--;
			}
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








