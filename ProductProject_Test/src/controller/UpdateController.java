package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class UpdateController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 수정을 시작합니다..........");
		System.out.print("수정할 제품번호 입력 : ");
		String no = sc.nextLine();
		
		ProductVO vo = ProductService.getInstance().searchProduct(no);
		
		if(vo == null) {
			System.out.println("수정할 제품이 없습니다.");
			return;
		}
		System.out.print("수정할 제품명 입력 : ");
		vo.setName(sc.nextLine());
		System.out.print("수정할 제조사 입력 : ");
		vo.setMaker(sc.nextLine());
		System.out.print("수정할 창고위치 입력 : ");
		vo.setStorage(sc.nextLine());
		System.out.print("수정할 재고 입력 : ");
		vo.setEa(sc.nextInt());
		sc.nextLine();
		
		System.out.println("제품 수정 완료");
	}

}







