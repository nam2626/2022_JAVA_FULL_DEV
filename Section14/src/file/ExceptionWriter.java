package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionWriter {

	public static void main(String[] args) {
		try {
			throw new Exception("에러 발생");
		}catch (Exception e) {
			e.printStackTrace();
			FileWriter fw = null;
			PrintWriter pw = null;
			
			try {
				fw = new FileWriter("exception.txt",true);
				pw = new PrintWriter(fw);
				e.printStackTrace(pw);
				StackTraceElement[] arr = e.getStackTrace();
				System.out.println(e.getClass().getName() + " : " + e.getMessage());
				for(StackTraceElement ste : arr)
					System.out.println(ste);
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally {
				try {
					if(fw != null)fw.close();
					if(pw != null)pw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}





