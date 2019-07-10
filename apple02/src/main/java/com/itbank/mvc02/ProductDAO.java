package com.itbank.mvc02;

public class ProductDAO {
	
	public void insert(ProductDTO productDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		System.out.println("저장된 상품id : " + productDTO.getId());
		System.out.println("저장된 상품명 : " + productDTO.getName());
		System.out.println("저장된 가격 : " + productDTO.getPrice());
		System.out.println("저장된 포인트 : " + productDTO.getPoint());
	}
	
	public void delete(ProductDTO productDTO) {
		System.out.println("DB연동해서 delete sql문 실행");
		System.out.println("삭제된 상품id : " + productDTO.getId());
		System.out.println("삭제된 상품명 : " + productDTO.getName());
	}
	
	public void search(ProductDTO productDTO) {
		System.out.println("DB연동해서 search sql문 실행");
		System.out.println("검색된 상품id : " + productDTO.getId());
		System.out.println("검색된 상품명 : " + productDTO.getName());
		System.out.println("검색된 가격 : " + productDTO.getPrice());
		System.out.println("검색된 포인트 : " + productDTO.getPoint());
	}
	public void searchTable(ProductDTO productDTO) {
		System.out.println("DB연동해서 searchTable sql문 실행");
		System.out.println("검색된 상품id : " + productDTO.getId());
		System.out.println("검색된 상품명 : " + productDTO.getName());
		System.out.println("검색된 가격 : " + productDTO.getPrice());
		System.out.println("검색된 포인트 : " + productDTO.getPoint());
	}
	
	public void insert2(ProductDTO productDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		System.out.println("저장된 상품id : " + productDTO.getId());
		System.out.println("저장된 상품명 : " + productDTO.getName());
		System.out.println("저장된 가격 : " + productDTO.getPrice());
		productDTO.setPoint("0");
		System.out.println("저장된 포인트 : " + productDTO.getPoint());
	}
}
