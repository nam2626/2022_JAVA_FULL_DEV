package read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		// 1. 파일오픈 - write.txt
		File file = new File("write.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 2. 스트림 생성 - FileReader, BufferedReader
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// 3. 파일 내용 읽기
			while (true) {
				String s = br.readLine();
				if (s == null)
					break;
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 4. 스트림 닫기
			try {
				if(br != null)br.close();
				if(fr != null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
