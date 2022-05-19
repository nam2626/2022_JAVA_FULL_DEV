package service;

public class StudentService {
	private static StudentService instance = new StudentService();


	private StudentService() {
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}
	
}





