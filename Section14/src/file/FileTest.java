package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:\\test\\test.txt");
		System.out.println(file);
		System.out.println(file.getParent());
		//부모 폴더 경로
		File parentFile = file.getParentFile();
		//현재 파일 객체의 절대 경로
		System.out.println(parentFile.getAbsolutePath());
		
		System.out.println(parentFile.exists());
		//파일 생성전에 파일이 위치한 폴더 경로가 있는지 체크
		if(!parentFile.exists()) {
			//경로가 없을때 해당 경로까지의 모든 폴더를 생성
			parentFile.mkdirs();
			System.out.println("해당 경로 폴더를 전부 생성");
		}
		try {
			//파일 생성
			boolean result = file.createNewFile();
			System.out.println(result);
			file.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}








