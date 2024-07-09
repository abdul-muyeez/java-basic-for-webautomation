package it.bd;

public class InheritExample extends ObjectCalling {

	public static void main(String[] args) {


		calculation("minus", 50, 20);
		//sum(10, 40);   // object need
		
		InheritExample inherit= new InheritExample();
		inherit.sum (10,40);
	

	}

}
