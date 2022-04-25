package inheritance_02;

public class SalaryEmployee extends Employee{
	@Override
	public void work() {
		System.out.println("직원이 영업을 합니다.");
	}
}
