package com.itbank.mvc06;

public class FactoryBean {
	
	//객체 생성만 해서 생성한 객체를 계속 넘기기만 하는 클래스(팩토리 방식)
	
	public Object getBean(String name) {
		
		Object bean = null;
		
		if(name.equals("apple")) {
			bean = new AppleTV();
		}else if (name.equals("banana")) {
			bean = new BananaTv();
		}else if (name.equals("Cherry")) {
			bean = new CherryTv();
		}else {
			
		}
		return bean;
	}
}
