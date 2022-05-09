package step02;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		DataOutputStream dos = null;
		Scanner sc = null;
		try {
			server = new Socket("127.0.0.1",9999);
			dos = new DataOutputStream(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			sc = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int ea = sc.nextInt();
			dos.writeInt(ea);
			dos.flush();
			String str = br.readLine();
			String[] arr = str.split("\t");
			int sum = 0;
			for(String s : arr)
				sum += Integer.parseInt(s);
			System.out.println("보낸 숫자의 약수들의 총합 : " + sum);
		} catch (UnknownHostException e) {
			e.printStackTrace();
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






