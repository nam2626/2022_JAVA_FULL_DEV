package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class PrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<ProductVO> list = ProductService.getInstance().getList();
		System.out.println("전체 학생 정보를 출력합니다..........");
		if(list.isEmpty()) {
			System.out.println("출력할 데이터가 하나도 없습니다.");
			return;
		}
		for(ProductVO vo : list)
			vo.printProductInfo();
	}

}
