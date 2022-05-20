package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller = null;
		
		switch (no) {
		case 1: 
			controller = new RegisterStudentController();
			break;
		case 2:
			controller = new SearchStudent();
			break;
		case 3:
			controller = new UpdateStudentController();
			break;
		case 4:
			controller = new DeleteStudentController();
			break;
		case 5:
			controller = new PrintAllStudentController();
			break;
		case 6:
			controller = new SelectTopStudentController();
			break;
		}
		
		
		return controller;
	}
}








