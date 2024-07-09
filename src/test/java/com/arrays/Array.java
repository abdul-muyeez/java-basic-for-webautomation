package com.arrays;

import java.util.Arrays;
import java.util.List;



public class Array {

	public static void main(String[] args) {

		/*
		 * Declaring and Creating an Array
		 */
		String[] fruits = { "Mango", "Apple", "Banana" };
		int[] numbers = {4, 2, 6, 8, 1};

		/*
		 * Access An Array
		 */
		System.out.println(fruits[1]);

		/*
		 * Change Array Element
		 */
		fruits[1] = "Orange";
		System.out.println(fruits[1]);

		/*
		 * Length
		 */
		System.out.println(fruits.length);
		
		/*
		 * Print all values
		 */
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		/*
		 * sort()
		 */
		Arrays.sort(numbers);
		System.out.println("Sorting Output: "+Arrays.toString(numbers));
		
		/*
		 * binarySearch()
		 */
		int index = Arrays.binarySearch(numbers, 4);
		System.out.println("Binary Search Output: "+index);
		
		/*
		 * copyOf()
		 */
		int[] copiedNumbers = Arrays.copyOf(numbers, 5);
		System.out.println("copyOf() output:  "+Arrays.toString(copiedNumbers));
		
		/*
		 * fill()
		 */
		Arrays.fill(numbers, 10);
		System.out.println("Fill() output:  "+Arrays.toString(numbers));
		
		/*
		 * toString()
		 */
		System.out.println("toString() output:  "+Arrays.toString(numbers));
		
		/*
		 * equals()
		 */
		int[] numbers1 = {1, 2, 3};
		int[] numbers2 = {1, 2, 3};
		boolean equalArrays = Arrays.equals(numbers1, numbers2);
		System.out.println("equals() output:  "+equalArrays);
		
		/*
		 * asList()
		 */
		String[] words = {"hello", "world"};
		List<String> wordList = Arrays.asList(words);
		System.out.println("asList() output:  "+wordList);
		
		/*
		 * Multi-Dimensional Arrays
		 */
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }
	}

}
