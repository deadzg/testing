package com.innerclass.sampleprog;

import com.innerclass.sampleprog.InnerClass1;


public class DriverCode {
	public static void main (String args[]) {
		
		InnerClass1 inc1 = new InnerClass1();
		
		inc1.setNum(5);
		inc1.setStr1("Outter class");
		
		inc1.test();
		
		InnerClass1.MyInnerClass myinc = inc1.new MyInnerClass();
		
		myinc.setStr2("Inner class");
		myinc.setNum2(7);
		
		myinc.innerTest();
	
	}
}
