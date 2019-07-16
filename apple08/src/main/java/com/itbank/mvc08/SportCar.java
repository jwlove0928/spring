package com.itbank.mvc08;

public class SportCar implements Car {

	Window window;
	String color;
	int speed;
	Door door;
	
	public void setWindow(Window window) {
		this.window = window;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setDoor(Door door) {
		this.door = door;
	}
	

	public SportCar() {
		
	}
	
	public SportCar(Window window) {
		this.window = window;
	}
	
	@Override
	public void open() {
		window.open();
		System.out.println("차 색은 : " + color);
		System.out.println("차 최고 속도는 : " + speed);
		door.DoorOepn();
	}

	@Override
	public void close() {
		window.close();
		door.DoorClose();
	}

}
