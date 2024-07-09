package it.bd;

public class MethodExample {

	public static void sum(int x, int y) {
		System.out.println("Summation: "+(x+y));
	}

	public static void calculation(String condition, int x, int y) {
		if(condition.equals("plus")) {
			System.out.println("Summation: "+(x+y));
		}else if(condition.equals("minus")) {
			System.out.println("Sub: "+(x-y));
		}else if(condition.equals("div"))
		System.out.println("Div: "+(x/y));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum (11,30);
		calculation("minus", 30, 20);
		
		
		int number1 = 10;
		int number2 = 20;
		int result = number1+number2;
		System.out.println("Total: "+result);

	}

}
