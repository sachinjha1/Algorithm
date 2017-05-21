/**
 * 
 */
package com.q;

/**
 * @author Sachin Jha 
 * Implementing queue using LinkdList 
 */
public class LinkList {

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
	 * Very similar implementation of Linkedlist's addLast()
	 * All newly added node goes to last
	 * @param newNode
	 */
	public void enqueue(Node newNode) {
		if (count == 0) {
			// No existing elements then head also points to this new node
			head = newNode;

		} else {
			// Elements exists then existing tail node's next element is this
			// new node
			tail.next = newNode;
		}
		// Tail points to this new node now
		tail = newNode;

		count++;
	}

	/**
	 * Ver similar implementation of LinkedList's removeFirst()
	 * Remove the 1st element which is oldest one...because adding new element is always goes to end/last
	 * @return
	 */
	public int dequeue() {
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


}
