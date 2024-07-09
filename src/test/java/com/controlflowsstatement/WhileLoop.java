package com.controlflowsstatement;


public class WhileLoop {

	public static void main(String[] args) {
		int token = 100;

        while(token < 110)
        {
            System.out.println("Token " +token+ " Not Yet Expired!");
            token++;
        }
	}

}
