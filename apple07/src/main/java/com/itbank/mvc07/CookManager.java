package com.itbank.mvc07;

public class CookManager {
	
	ICook Ic;
	
	public CookManager() {
		
	}
	
	public CookManager(ICook cook) {
		Ic = cook;
	}
	
	public void orderRice() {
		Ic.makeRice();
	}
	
	public void orderSoup() {
		Ic.makeSoup();
	}
	
}
