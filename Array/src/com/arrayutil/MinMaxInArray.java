/**
 * 
 */
package com.arrayutil;

/**
 * @author Sachin Jha
 *
 */
public class MinMaxInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inArr = new int[]{4,7,7,2,9,4}; 
		
		int min = findMin(inArr);
		System.out.println(String.format("Minium value in array is %s", min));
		
		int max = findMax(inArr);
		System.out.println(String.format("Maximum value in array is %s", max));
	}

	public static int findMin(int[] inArr){
		int min=inArr[0];
		for(int i=1;i<inArr.length;i++){
			if(inArr[i]<min){
				min=inArr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] inArr){
		int min=inArr[0];
		for(int i=1;i<inArr.length;i++){
			if(inArr[i]>min){
				min=inArr[i];
			}
		}
		return min;
	}
}
