package com.btree;

/**
 * 
 * @author Sachin Jha
 *
 */
public class BTree {
	
	//Head node
	private BTNode head;
	//Number of nodes in tree
	private int count;
	
	/**
	 * Add new node to tree. If no head node then make this new node as head node
	 * If head exists then use reusable api to add a node by passing head node.
	 * @param value
	 */
	public void add(int value){
		if(head==null){
			head = new BTNode(value);
		}else{
			//recursive logic in addTo to add a new node in binary tree
			addTo(head, value);
		}
		count++;
	}
	
	public boolean contains(int value){
		//if Node is found then return true
		return findWithParent(value,null)!=null;
	}
	
	
	public BTNode findWithParent(int value, BTNode parent) {

		BTNode current = head;
		parent = null;

		while (current != null) {
			if (value < current.value) {
				parent = current;
				current = current.left;
			} else if (value > current.value) {
				parent = current;
				current = current.right;
			} else {
				break;
			}
		}

		return current;
	}
	
	
	/**
	 * Add a node in a binary tree
	 * @param node
	 * @param value
	 */
	public void addTo(BTNode node, int value){
		//If value is less then node value then move left
		if(value<node.value){
			//left node does not exist then create left node with this value
			if(node.left==null){
				node.left = new BTNode(value);
			}else{
				//If left node exist already then pass left Node and run the whole logic again.
				addTo(node.left, value);
			}
		}else{
			//If value is more than node value then move right. If right node does not exist then create 
			// right node with this passed value
			if(node.right==null){
				node.right = new BTNode(value);
			}else{
				//Right node already exist then run whole logic from right node
				addTo(node.right, value);
			}			
		}
		
	}
	
}
