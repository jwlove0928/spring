package com.itbank.mvc06;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser4 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		
		Tv tv = (Tv)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDonw();
		
	}
}
