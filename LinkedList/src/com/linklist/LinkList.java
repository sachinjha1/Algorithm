/**
 * 
 */
package com.linklist;

/**
 * @author Sachin Jha Implement linkedlist by handling head, Tail & operations
 *         (Add, Remove, Find & Enumerate)
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

		/* Simple Node chain - START */
		Node first = new Node(3);
		Node middle = new Node(5);
		Node last = new Node(7);

		// (3,*)->(5,*)->(7,null)
		first.next = middle;
		middle.next = last;

		Node node = first;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
		/* Simple Node chain - END */

		/* Linked List - START */

		/* Linked List - END */

	}

	public void addFirst(Node newNode) {
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

	public void addLast(Node newNode) {
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

	public void removeLast() {
		if (count == 1) {
			head = null;
			tail = null;
			count--;
		}
		if (count > 1) {
			Node currentNode = head;
			while (currentNode.next != tail) {
				currentNode = currentNode.next;
			}
			currentNode.next = null;
			tail = currentNode;
			count--;
		}
	}

	public void removeFirst() {
		if (count == 1) {
			head = null;
			tail = null;
		} else if (count > 1) {
			head = head.next;
			count--;
		}

	}

	public void iterateList(Node startHeadNode) {
		while (startHeadNode != null) {
			System.out.println(startHeadNode.value);
			// Move to next node
			startHeadNode = startHeadNode.next;
		}

	}

}
