package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonWriteMain {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("person.dat");
			oos = new ObjectOutputStream(fos);
			
			for(int i=0;i<5;i++) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt(); sc.nextLine();
				list.add(new Person(name, age));
			}
			for(Person p : list) {
				oos.writeObject(p);
			}
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null)oos.close();
				if(fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









