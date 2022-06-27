package write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteMain {

	public static void main(String[] args) {
		//1. 파일연결
		File file = new File("write.txt");
		//2. 스트림 생성(입력/출력)
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			//3. 입출력 수행
			pw.println("Hello World");
			pw.println("안녕하세요");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4. 스트림 닫기
			try {
				if(pw != null)pw.close();
				if(fw != null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}





