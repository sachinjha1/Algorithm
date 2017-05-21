/**
 * 
 */
package com.math;

/**
 * @author Sachin Jha
 * Least common multiple of two numbers.
 */
public class Lcm {

	public static void main(String[] args) {
		System.out.println(calculateLCM(12, 15));
	}
	
	
	/**
	 * LCM (a,b) = (axb)/GCD(a,b)
	 *  
	 * @param a
	 * @param b
	 * @return LCM of a & b. For e.g. GCD(12,15)=60
	 */
	private static int calculateLCM(int a, int b){
		int gcd = calculateGCD(a, b);
		int lcm = (a/gcd)*b; //same as a*b/gcd but a*b could be very large number so avoiding that
		return lcm;
	}
	
	private static int calculateGCD(int a, int b){
		if(b==0){
			return a;
		}else{
			int r = a%b;
		    return calculateGCD(b, r);
		}
	}

}
