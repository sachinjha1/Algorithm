/**
 * 
 */
package com.prime;

/**
 * @author Sachin Jha
 * Perform prime factorization of an integer. 
 * The prime factorization of an integer is the multiset of primes those product is the integer.
 */
public class PrimeFactor {


	public static void main(String[] args) {
		
		primeFactors(5689100);

	}
	
	private static void primeFactors(int n){
		//Divide by 2 till its not divisible
		while(n%2==0){
			System.out.println(2+"x");
			n=n/2;
		}
		
		/* Start from 3 and check all odd numbers divisibility till square root of
		   final number came after above step */
		for(int i=3;i<Math.sqrt(n);i=i+2){
			while(n%i==0){
				System.out.println(i+"x");
				n=n/i;
			}
		}
		
		if(n>2){
			System.out.println(n+"x");
		}

	}
	
	

}
