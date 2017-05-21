/**
 * 
 */
package com.stackutil;

/**
 * @author Sachin Jha 
 * Implemented Stack using LinkdList idea. 
 */
public class Stack {

	// provides a pointer to first node
	public Node head;
	// provides a pointer to last node
	public Node tail;
	public int count;

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

	/**
	 * Very similar implementation of linkedlist's addFirst()
	 * @param newNode
	 */
	public void push(Node newNode) {
		// Copy reference of head
		Node temp = head;
		// head reference points to new Node
		head = newNode;
		// new node next reference tied to previously stored head
		newNode.next = temp;
		count++;

		// Only 1 node then Head and tail both points to same/only node
		if (count == 1) {
			tail = head;
		}
	}

	/**
	 * Very similar implementation of LinkedList's removeFirst()
	 */
	public int pop() {
		int value = head.value;
		if (count == 1) {
			head = null;
			tail = null;
		} else if (count > 1) {
			head = head.next;
			count--;
		}
		return value;

	}
	
	public int peep(){
		return head.value; 
	}


}
