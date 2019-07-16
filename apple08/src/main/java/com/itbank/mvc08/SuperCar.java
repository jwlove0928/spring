package com.itbank.mvc08;

public class SuperCar implements Car {

	Window window2;
	String color;
	int speed;
	Door door2;
	
	public SuperCar(Window window2, String color, int speed, Door door2) {
		this.window2 = window2;
		this.color = color;
		this.speed = speed;
		this.door2 = door2;
	}

	@Override
	public void open() {
		window2.open();
		System.out.println("차 색은 : " + color);
		System.out.println("차 속도는 : " + speed);
		door2.DoorOepn();
	}

	@Override
	public void close() {
		window2.close();
		door2.DoorClose();
	}

}
