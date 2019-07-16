package com.itbank.mvc08;

public class GeneralDoor implements Door {

	@Override
	public void DoorOepn() {
		System.out.println("무난하게 열어");
	}

	@Override
	public void DoorClose() {
		System.out.println("어쨌든 추우니까 닫어");
	}

}
