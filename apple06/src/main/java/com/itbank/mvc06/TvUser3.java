package com.itbank.mvc06;

public class TvUser3 {
	public static void main(String[] args) {
		
		FactoryBean factory = new FactoryBean();
		
		Tv tv = (Tv)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDonw();
	}
}
