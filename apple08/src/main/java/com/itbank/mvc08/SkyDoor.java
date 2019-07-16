package com.itbank.mvc08;

public class SkyDoor implements Door {

	@Override
	public void DoorOepn() {
		System.out.println("하늘을 향해 오픈");
	}

	@Override
	public void DoorClose() {
		System.out.println("추우니까 닫어");
	}

}
