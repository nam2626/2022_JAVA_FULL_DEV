package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			//저장할 파일 경로
			fw = new FileWriter("hello.txt");
			//프로세스 스트림 초기화
			pw = new PrintWriter(fw);
			
			pw.println("안녕하세요");
			pw.println("Hello World");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null)pw.close();
				if(fw != null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





