/**
 * 
 */
package com.math;

/**
 * @author Sachin Jha
 * Greatest common divisor of two numbers.
 * Referring Euclids algorithm (https://en.wikipedia.org/wiki/Euclidean_algorithm)
 */
public class Gcd {

	public static void main(String[] args) {
		System.out.println(calculateGCD(78, 66));
	}
	
	
	/**
	 * A  |  B  |  A %(mod) B
	 * -----------------------
	 * 78 |  66 |  12
	 * 66 |  12 |   6
	 * 12 |   6 |   0
	 *  6 |   0 | -- GCD is 6
	 *  
	 *  GCD(A, B) = GCD(B, A mod B)
	 *  A=mxB+R so if gcd is g then if A is divisible by g then mxB is also divisible by g and also R is divisible by g
	 *  
	 * @param a
	 * @param b
	 * @return gcd of a & b. For e.g. GCD(78,66)=6
	 */
	private static int calculateGCD(int a, int b){
		if(b==0){
			return a;
		}else{
			int r = a%b;
		    return calculateGCD(b, r);
		}
	}

}
