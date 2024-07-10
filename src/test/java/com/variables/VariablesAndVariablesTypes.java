package com.variables;


public class VariablesAndVariablesTypes {

	/*
	 * Local Variable
	 */
	private void localVariables() {
		// Local Variables
		int x = 7;
		int y = 10;
		int z = x + y;
		System.out.println("Print Local Variables");
		System.out.println(z);
		System.out.println("========================");
	}

	/*
	 * Instance Variables
	 */

	public String name_instance; // Instance Variable
	public int id; // Instance Variable

	public void printInstanceVariables(String value, int number) {
		name_instance = value;
		id = number;
		System.out.println("Print Instance Variables");
		System.out.println("Name : " + name_instance);
		System.out.println("id : " + id);
		System.out.println("========================");
	}

	/*
	 * Static Variables
	 */

	static String name_static;
	static long number;

	public static void printStaticVariables() {
		name_static = "Ebrahim Hossain";
		number = 1234;
		System.out.println("Print Static Variables");
		System.out.println("Name : " + name_static);
		System.out.println("Number : " + number);
	}

	public static void main(String[] args) {
		VariablesAndVariablesTypes variables= new VariablesAndVariablesTypes();
		
		//Call Local Variables
		variables.localVariables();
		
		//Call Instance Variables
		variables.printInstanceVariables("Ebrahim", 881);
		
		//Call Static variables
		printStaticVariables();
		
		

	}

}
