package employee;

import java.util.Scanner;

public class EmployeeService {
	private Employee[] arr;
	private int index;
	
	public EmployeeService() {
		index = 0;
		arr = new Employee[10];
	}
	
	public void registerEmployee(Scanner sc) {
		//배열 개수 늘리기
		if(index == arr.length) {
			Employee[] temp = arr;
			arr = new Employee[arr.length+3];
			for(int i=0;i<temp.length;i++)
				arr[i] = temp[i];
		}
		//사원정보 등록
		System.out.println("사원 정보 등록을 시작합니다..........");
		//1 - 일반사원, 2 - 영업직, 3 - 파견직을 구분해서 입력 받은후
		//arr에 객체를 생성해서 등록
		System.out.println("1 - 일반 사원");
		System.out.println("2 - 영업직 사원");
		System.out.println("3 - 파견직 사원");
		System.out.print("원하시는 번호 : ");
		int no = sc.nextInt(); sc.nextLine();
		
		System.out.print("\n사원번호 입력 : ");
		String eno = sc.nextLine();
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("기본급 입력 : ");
		int salary = sc.nextInt(); sc.nextLine();
		
		switch(no) {
		case 2:
			System.out.println("영업포인트 입력 : ");
			int point = sc.nextInt(); sc.nextLine();
			arr[index++] = new SalaryEmployee(eno, name, salary, point);
			break;
		case 3:
			System.out.println("파견지 위험도 입력 : ");
			char danger = sc.nextLine().charAt(0);//입력받은 문자열의 첫번째 글자를 뽑음
			arr[index++] = new DispatchEmployee(eno, name, salary, danger);
			break;
		default:
			arr[index++] = new Employee(eno, name, salary);
		}
		System.out.println("사원정보 등록 완료");
		
	}
	//전체 사원정보 출력
	public void printAllEmployee() {
		
	}
}

















