package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriteTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("data.dat");
			dos = new DataOutputStream(fos);
			
			int n=100;
			double pi=3.1415;
			char ch = 'A';
			boolean flag = true;
			
			dos.writeInt(n);
			dos.writeDouble(pi);
			dos.writeChar(ch);
			dos.writeBoolean(flag);
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos != null)dos.close();
				if(fos != null)fos.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}






