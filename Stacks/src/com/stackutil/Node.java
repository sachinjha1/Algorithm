/**
 * 
 */
package com.stackutil;

/**
 * @author Sachin Jha
 * Node
 *
 */
public class Node {
	public int value;
	public Node next;
	
	public Node(int value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}
	
	public Node(int value) {
		super();
		this.value = value;
	}
	
	public Node(Node next) {
		super();
		this.next = next;
	}
	
}
