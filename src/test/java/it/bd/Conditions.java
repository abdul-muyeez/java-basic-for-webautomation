package it.bd;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
    	System.out.println("Please enter 1st Number");
		int number1 = input.nextInt();
		
		System.out.println("Please enter 2nd Number");
		int number2 = input.nextInt();
		
		 //if(Condition==true)
		
		if(number1>number2)
			System.out.println(number1+"Greater than"+number2);
		else if(number1==number2)
			System.out.println(number1+"Equal to "+number2);
		else
			System.out.println(number1+"less"+number2);
	
		//String type Condition
		
		System.out.println("Please enter 1st text");
		String text1 = input.nextLine();
		
		System.out.println("Please enter 2nd text");
		String text2 = input.nextLine();
		
		if(text1.equals(text2)) {
			System.out.println(text1+"is exact to"+text2);
		}else if(text1.equalsIgnoreCase(text2)) {
			System.out.println(text1+"is equal to"+text2);
		}
			
		
		
	}

}
