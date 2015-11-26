package com.smalwe.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	
	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

		List<String> listStr = new ArrayList<String>();
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
          //  System.out.println("hello world");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String line1 = br.readLine();
            System.out.println(reverseString(line1));
        }
       

        
    }
	
	public static String reverseString(String input) {
		
		String output = null;
		
		int len = input.length();
		
		char[] ca = input.toCharArray();
		
		char temp ;
		
		if(input == null){
			output = null;
		}
		
		else if (len == 1) {
			output = input;
		}
		
		else {
			for(int i = 0 ; i< len/2 ; i++) {
				temp = ca[i];
				ca[i] = ca[len-i - 1];
				ca[len - i - 1] = temp;
				
				
			}
			output = String.valueOf(ca);
		}
		
		return output;
	}
	
	
	
}
