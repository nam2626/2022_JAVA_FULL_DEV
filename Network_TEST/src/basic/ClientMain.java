package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner sc = null;
		try {
			//1. Server Connect - IP Address, port
			server = new Socket("127.0.0.1",1234);
			//2. Stream Init
			pw = new PrintWriter(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			sc = new Scanner(System.in);
			//3. Data Send/Receive
			//사용자로부터 입력
			System.out.print("숫자 입력 : ");
			int ea = sc.nextInt();
			//서버로 전송
			pw.println(ea);
			pw.flush();
			//결과를 받아서 출력
			String str = br.readLine();
			System.out.println(str);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//4. Close
				if(br != null)br.close();
				if(pw != null)pw.close();
				if(server != null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}






