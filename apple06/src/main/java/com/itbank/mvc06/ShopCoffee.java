package com.itbank.mvc06;

public abstract class ShopCoffee implements Coffee{

	public abstract void prepare(); //추상메소드
	
	
	@Override
	public void make() {
		System.out.println("가계에서 커피를 만들다.");
	}

	@Override
	public void pay() {
		System.out.println("가게에서 pos기로 계산하다.");
	}
	
}
