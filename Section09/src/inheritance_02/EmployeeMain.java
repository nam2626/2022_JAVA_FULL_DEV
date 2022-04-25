package inheritance_02;

public class EmployeeMain {
	//Employee는 SalaryEmployee, DispatchEmployee까지 올수 있다.(자식 클래스라서)
	public static void work(Employee e) {
		e.work();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		SalaryEmployee e2 = new SalaryEmployee();
		DispatchEmployee e3 = new DispatchEmployee();
		work(e1);
		work(e2);
		work(e3);
	}

}
