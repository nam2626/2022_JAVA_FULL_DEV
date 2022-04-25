package inheritance_02;

public class DispatchEmployee extends Employee{
	@Override
	public void work() {
		System.out.println("직원이 파견을 갑니다");
	}
}
