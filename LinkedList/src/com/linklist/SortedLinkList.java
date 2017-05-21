package com.linklist;

/**
 * 
 * @author Sachin Jha
 *
 */
public class SortedLinkList extends LinkList {

	@Override
	public void addFirst(Node newNode) {
		Node curr=head;
		Node prev=null;
		//Iterate till we find a value in linked list greater than passed node value
		while(curr!=null && curr.value <= newNode.value){
			prev=curr;
			curr = curr.next;
		}
		
		if (curr != null) {
			prev.next = newNode;
			newNode.next = curr;
		} else {
			addLast(newNode);
		}
	}

}
