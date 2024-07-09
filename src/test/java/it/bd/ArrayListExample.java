package it.bd;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList<DataType> arrayListName = new ArrayList<DataType>();
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		numbers.add(10);
		numbers.add(11);
		numbers.add(15);
		numbers.add(16);
		numbers.add(20);
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		
		numbers.remove(1);
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		numbers.clear();
		System.out.println(numbers);
		System.out.println(numbers.size());
		
	}

}
