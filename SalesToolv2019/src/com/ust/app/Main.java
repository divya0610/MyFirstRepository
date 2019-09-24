package com.ust.app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sales sales = new Sales();
		System.out.println("Welcome");
		displayGreeting();
		sales.display();
		

	}
	private static void displayGreeting(){
		System.out.println("Displaying Sales");
	}

}
