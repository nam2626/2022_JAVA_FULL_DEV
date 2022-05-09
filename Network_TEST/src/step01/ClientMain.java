package step01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		DataOutputStream dos = null;
		Scanner sc = null;
		
		try {
			server = new Socket("127.0.0.1",5000);
			dos = new DataOutputStream(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			sc = new Scanner(System.in);
			
			System.out.print("구매할 로또번호 개수 입력 : ");
			int ea = sc.nextInt();
			
			dos.writeInt(ea);
			dos.flush();
			
			String str = br.readLine();
			String[] arr = str.split("\t");
			for(String s : arr)
				System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
				if(dos != null)dos.close();
				if(server != null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









	