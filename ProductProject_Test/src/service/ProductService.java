package service;

import java.util.ArrayList;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();
	private ArrayList<ProductVO> list;
	private ProductService() {
		list = new ArrayList<ProductVO>();
	}

	public static ProductService getInstance() {
		if(instance == null)
			instance = new ProductService();
		return instance;
	}

	public ArrayList<ProductVO> getList() {
		return list;
	}

	public void insertProduct(ProductVO vo) {
		list.add(vo);
		System.out.println("제품 정보 등록 성공");
	}

	public ProductVO searchProduct(String productNo) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNo().equals(productNo))
				return list.get(i);
		}
		return null;
	}	
	
	
	
}




