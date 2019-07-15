package com.itbank.mvc06;

public class AppleTV implements Tv {
	
	public void powerOn() {
		System.out.println("애플 TV를 키다.");
	}
	public void powerOff() {
		System.out.println("애플 TV를 끄다.");
	}
	public void volumeUp() {
		System.out.println("애플 TV볼륨 Up.");
	}
	public void volumeDonw() {
		System.out.println("애플 TV볼륨 Down.");
	}
}
