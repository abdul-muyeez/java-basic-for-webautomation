package com.operators;

/*
 * Author: Md.Ebrahim Hossain
 * SQA Engineer - Achieve Test Prep
 */

public class ShiftOperator {

	/*
	 * Left Shift Operator (<<)
	 */
	public static void leftShiftOperatorExample() {
		int value1 = 15, value2 = 26, value5;
		value5 = value1 << value2;
		System.out.println("Left Shift Operator (<<) Output: " + value5);
	}

	/*
	 * Right Shift Operator (>>)
	 */
	public static void rightShiftOperatorExample() {
		int value1 = 15, value2 = 2, value5;
		value5 = value1 >> value2;
		System.out.println("Right Shift Operator (>>) Output: " + value5);
	}

	public static void main(String[] args) {

		leftShiftOperatorExample();
		rightShiftOperatorExample();
	}

}
