/**
 * 
 */
package com.linklist;

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
	
	
	public static void main(String[] args){
		Node first = new Node(3);
		Node middle = new Node(5);
		Node last = new Node(7);
		
		// (3,*)->(5,*)->(7,null)
		first.next=middle;
		middle.next=last;			
	}
	
}
