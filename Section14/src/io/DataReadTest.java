package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("data.dat");
			dis = new DataInputStream(fis);
			//저장한 순서대로 읽기
			int n = dis.readInt();
			double d = dis.readDouble();
			char ch = dis.readChar();
			boolean b = dis.readBoolean();
			
			System.out.println(n + " " + d + " " + ch + " " + b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis != null)dis.close();
				if(fis != null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}








