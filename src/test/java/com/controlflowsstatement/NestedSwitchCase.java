package com.controlflowsstatement;



public class NestedSwitchCase {

	public static void main(String[] args) {

		char direction = 'S';

		switch (direction) {
		case 'E':
			System.out.println("East"); // LINE A
			break;
		case 'W':
			System.out.println("West"); // LINE B
			break;
		case 'S':
			System.out.println("South"); // LINE C
			break;
		case 'N':
			System.out.println("North"); // LINE D
			break;
		default:
			System.out.println("Unknown Direction"); // LINE E
			break;
		}

	}
}
