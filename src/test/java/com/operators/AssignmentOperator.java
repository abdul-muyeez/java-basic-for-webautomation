package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 * Assignment Operators
		 */
		
		int value1 = 10 , value2 = 20;

		value1 += value2;
        System.out.println("Used '+=' Operator: " +value1);

        value1 -= value2;
        System.out.println("Used '-=' operator: "+value1);

        value1 *= value2;
        System.out.println("Used '*=' operator: "+value1);

        value1 /= value2;
        System.out.println("Used '/=' operator: "+value1);

        value1 %= value2;
        System.out.println("Used '%=' operator: "+value1);
	}
}
