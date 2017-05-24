/**
 * 
 */
package com.btree;

/**
 * @author Sachin Jha
 * Node
 *
 */
public class BTNode implements Comparable<BTNode>{
	public int value;
	public BTNode left;
	public BTNode right;
	
	@Override
	public int compareTo(BTNode o) {
		return this.value-o.value;
	}
	
	public BTNode(int value){
		this.value = value;
	}
}
