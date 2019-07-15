package com.itbank.mvc07;

public class ChienseCook implements ICook {

	@Override
	public void makeRice() {
		System.out.println("중국인 밥 만들어요");
	}

	@Override
	public void makeSoup() {
		System.out.println("중국인 국 만들어요");

	}

	@Override
	public void makeSalad() {
		System.out.println("중국인 샐러드 만들어요");

	}

	@Override
	public void makeSource() {
		System.out.println("중국인 소스 만들어요");

	}

}
