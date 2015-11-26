package com.innerclass.sampleprog;

public class InnerClass1 {
	
	private String str1;
	private int num;
	
	public void test(){
		System.out.print("Outter class executed");
	}
	
	public class MyInnerClass {
		
		private String str2;
		private int num2;
		public String getStr2() {
			return str2;
		}
		public void setStr2(String str2) {
			this.str2 = str2;
		}
		public int getNum2() {
			return num2;
		}
		public void setNum2(int num2) {
			this.num2 = num2;
		}	
		
		public void innerTest() {
			System.out.print("Inner class executed");
		}
		
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}



