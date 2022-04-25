package inheritance_02;

public class EmployeeMain {
	public static void work(Employee e) {
		e.work();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		SalaryEmployee e2 = new SalaryEmployee();
		DispatchEmployee e3 = new DispatchEmployee();
	}

}
