package file;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File root = new File("c:\\");
		File[] list = root.listFiles();
		
		for(File file : list) {
			String fileName = file.getName();
			long fileSize = file.length();
			String etc = file.isDirectory() ? "<DIR>" : "\t"+fileSize;
			System.out.println(fileName + "\t\t" + etc);
		}
	}

}









