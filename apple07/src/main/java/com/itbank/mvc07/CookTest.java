package com.itbank.mvc07;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		
		ICook cook = (ICook)factory.getBean("KoreanCook");
		ICook cook1 = (ICook)factory.getBean("ChineseCook");
		
		cook.makeRice();
		cook.makeSoup();
		
		cook1.makeRice();
		cook1.makeSoup();
	}

}
