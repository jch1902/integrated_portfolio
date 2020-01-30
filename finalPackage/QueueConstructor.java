package finalPackage;

import finalPackage.QueueConstructor.Node;

public class QueueConstructor {
	public class Node{
		//type of data put inside the node
		String data;
		
		//head of linked list
		Node head;
	}
	Node top;
	QueueConstructor() {
		//avoid nullpointerexception
		this.top = null;
	}
	public boolean isEmpty() {//checks for empty node
		return(top == null);
	}
	public void push(String string) {
		//sets new node with inputed data
		Node position = new Node();
		position.data = string;
		
		//sets head node to latest to the top
		position.head = top;
		//resets top node
		top = position;
	}

	public void removeLast() {
		 if (top == null) 
	            return; 
	  
	        // Move the head pointer to the next node 
	        Node temp = top; 
	        top = top.head; 
	  
	        return top; 
		
	}
	public String toString() {
		Node check = top;
		Node previousNode = null;
		String returnString = "";
		while(check != null) {
			returnString+= check.data;
			
			previousNode = check;
			//check node keeps changing it to the next node
			check = check.head;
			
			
		}
		return returnString;
	}

}