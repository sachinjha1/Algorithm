/**
 * 
 */
package com.prime;

/**
 * @author Sachin Jha
 * Check if number is prime
 *
 */
public class PrimeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		boolean isPrime = isPrime(65000);
		System.out.println(isPrime);		
	}
	
	public static boolean isPrime(int input){		
		for(int i=2;i<=Math.sqrt(input);i++){
			if(input%i==0){
				return false;
			}
		}		
		return true;
	}

}
