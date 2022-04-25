package employee;

public class DispatchEmployee extends Employee{
	private char danger;

	public DispatchEmployee(String eno, String name, int salary, char danger) {
		super(eno, name, salary);
		this.danger = danger;
	}
	
	@Override
	public int getSalary() {
		switch(danger) {
		case 'A':
			return salary + (int)(salary*0.5);
		case 'B':
			return salary + (int)(salary*0.3);
		case 'C':
			return salary + (int)(salary*0.2);
		default:
			return salary + (int)(salary*0.1);
			
		}
	}
	
		
}





