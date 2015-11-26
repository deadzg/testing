package com.java.java8feature;

class LambdaBasics {
	
	public static void main (String args[]) {
		
		Greetings g = msg -> System.out.print("Hello Sir!!" + msg);
		
		BigDeal res = (int a, int b, int c) -> a + b + c;
		
		BigDeal res2 = (int a , int b ,int c) -> a*b*c;
		
		System.out.println (res.operation(5, 4, 3));
		System.out.println(res2.operation(3, 4, 5));
		g.sayMessage("Wassup!!");
	}
	
	public interface Greetings {
		void sayMessage (String msg);
	}
	
	public interface BigDeal {
		int operation (int a , int b, int c);
	}
	
	
}
