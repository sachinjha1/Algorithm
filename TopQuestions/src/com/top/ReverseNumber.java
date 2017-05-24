package com.top;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(12345));

	}
	
	private static final int reverseNumber(int in){
		int rev = 0;
		
		while(in!=0){
		rev = 10*rev + in%10;
		in=in/10;
		}
		
		return rev;
		
	}

}
