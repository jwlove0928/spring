package com.itbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@RequestMapping("confirm")
	public void insert(ProductDTO productDTO, ProductDAO productDAO) {
		System.out.println("DAO의 db연동 처리");
		productDAO.insert(productDTO);
	}
	
	@RequestMapping("delete")
	public void delete(ProductDTO productDTO, ProductDAO productDAO) {
		System.out.println("DAO의 db연동 처리");
		productDAO.delete(productDTO);
	}
	
	@RequestMapping("search")
	public String search(ProductDTO productDTO, ProductDAO productDAO) {
		System.out.println("DAO의 db연동 처리");
		String sId = productDTO.getId();
		if(sId.equals(productDTO.getId())) {
			return "search";
		}else {
			return "searchNOT";
		}
	}
	
	@RequestMapping("searchTable")
	public void searchTable(ProductDTO productDTO, ProductDAO productDAO) {
		System.out.println("DAO의 db연동 처리");
		productDAO.searchTable(productDTO);
	}
	
	@RequestMapping("confirm2")
	public void insert2(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.insert2(productDTO);
	}
}
