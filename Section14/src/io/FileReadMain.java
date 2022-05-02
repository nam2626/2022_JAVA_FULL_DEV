package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("text.txt");
			br = new BufferedReader(fr);
			String str = null;

//			while ((str = br.readLine()) != null) {
//				System.out.println(str);
//			}
			
			while(true) {
				str = br.readLine();//파일에서 한줄 읽어들음
				if(str == null) break; //읽어온 내용이 null이면 더이상 읽을 내용이 없다.
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
				if (fr != null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
