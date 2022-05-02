package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class InsertController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 등록을 시작합니다..........");

		//제품데이터 입력
		System.out.print("제품번호 입력 : ");
		String no = sc.nextLine();
		System.out.print("제품명 입력 : ");
		String name = sc.nextLine();
		System.out.print("제조사 입력 : ");
		String maker = sc.nextLine();
		System.out.print("창고위치 입력 : ");
		String storage = sc.nextLine();
		
		System.out.print("재고 입력 : ");
		int ea = sc.nextInt();
		sc.nextLine();
		
		ProductService.getInstance().insertProduct(new ProductVO(no, name, maker, ea, storage));
	}

}




