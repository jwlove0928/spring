package com.itbank.mvc06;

public class ChainShopCoffee extends ShopCoffee{
	
	@Override
	public void prepare() {
		System.out.println("체인 본저에서 물건을 준비하다.");
	}
}
