package com.itbank.mvc06;

public class BananaTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("바나나 TV를 켜다.");
	}

	@Override
	public void powerOff() {
		System.out.println("바나나 TV를 끄다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("바나나 TV를 볼륨 Up.");
	}

	@Override
	public void volumeDonw() {
		System.out.println("바나나 TV를 볼륨 Down.");

	}

}
