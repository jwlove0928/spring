package com.itbank.spring01;

public class MyHome {
	
	static Door woodDoor;
	
	public static void main(String[] args) {
		woodDoor = new 나무문();
		woodDoor = new 철제문();
		
		woodDoor.open();
		woodDoor.close();
		woodDoor.key();
		woodDoor.made();
	}
}
