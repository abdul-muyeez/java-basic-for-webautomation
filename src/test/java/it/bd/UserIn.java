package it.bd;

import java.util.Scanner;

public class UserIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassName objectName = new ClassName (parameters);
		
		Scanner input = new Scanner(System.in);
		
	 	System.out.println("Please enter a Number");
		int number = input.nextInt();
		System.out.println("Number: "+number);
		
		System.out.println("Pkease enter a Name");
		String name = input.nextLine();
		System.out.println("Name: "+name);


	}

}
