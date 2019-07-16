package com.itbank.mvc08;

public class StrongWindow implements Window {

	@Override
	public void open() {
		System.out.println("강화유리 열기");
	}

	@Override
	public void close() {
		System.out.println("강화유리 닫기");
	}

}
