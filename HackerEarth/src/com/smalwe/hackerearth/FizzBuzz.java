package com.smalwe.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FizzBuzz {
	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

		
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String line1 = br1.readLine();
            String s[] = line1.split(" ");
            
            if(s.length == N) {
            	fizzB(s);
            }
   
    }
	
	public static void fizzB(String s[]) {
		
		int in;
		boolean isMulThree = false;
		boolean isMulFive = false;
		for(String s1 : s ) {
			
			in = Integer.parseInt(s1);
			
			
			for (int j = 1 ; j<= in ; j ++){
			
				isMulThree = (j % 3) == 0 ? true : false;
				isMulFive = (j % 5) == 0 ? true : false;
				
				if(isMulThree && isMulFive) {
					System.out.println("FizzBuzz");
				}
				
				else if(isMulThree) {
					System.out.println("Fizz");
				}
				
				else if (isMulFive) {
					System.out.println("Buzz");
				}
				
				else {
					System.out.println(j);
				}
			}
		}
	}
}
