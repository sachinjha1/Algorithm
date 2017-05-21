/**
 * 
 */
package com.array;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Sachin Jha (sachinjha.com)
 * Given an array of lot of objects this algorithm will pick random
 * p amount of objects.
 */
public class RandomNPickArray {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		Object input[] = new Object[]{"1","2","3","4","5"};
		int pickCount = 3;
		try {
			pickRandom(input, pickCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static Object[] pickRandom(Object[] input, int pickCount) throws Exception{
		System.out.println("------Original below_______");
		int size = input.length;
		if(pickCount > size){
			throw new Exception("Cannt pick more than available elements size");
		}
		printArray(input);
		Random ran = new Random();
		for(int i=0;i<pickCount;i++){
			/* For any item with index i swap with item with 
			 * random index which is Random number from 0 to arraylength-1 */
			int j = ran.nextInt(size-1);
			//System.out.println(String.format("Exchanging elements between index %s & %s",i,j));
			//Exchanging values between i & j index
			Object temp = input[i];
			input[i]=input[j];
			input[j]=temp;
		}
		System.out.println("\n------Randmized Picked below_______");
		printArray(Arrays.copyOfRange(input, 0, pickCount));
		
		return null;
	}
	
	private static void printArray(Object[] input){
		for(Object each:input){
			System.out.print(String.format("[%s],",each.toString()));
		}
	}

}
