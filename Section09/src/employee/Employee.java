package employee;

public class Employee {
	private String eno;
	private String name;
	private int salary;
	
	public Employee(String eno, String name, int salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	
	public void printEmployeeInfo() {
		System.out.println(eno + " " + name + " " + getSalary());
	}
	
	public int getSalary() {return salary;}
}






