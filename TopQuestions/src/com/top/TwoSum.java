/**
 * 
 */
package com.top;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sachin Jha
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = new int[]{15,2,11,7};
		int[] res = twoSum(numbers, 9);
		System.out.println(res[0]+" , "+res[1]);
		
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> nmap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<numbers.length;i++){
			if(nmap.containsKey(target-numbers[i])){
				result[1]=i;
				result[0]=nmap.get(new Integer(target-numbers[i]));
				return result;
			}
			nmap.put(numbers[i], i);
			
		}
		
		
		return result;
	}

}
