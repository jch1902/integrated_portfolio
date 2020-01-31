package finalPackage;

import java.util.ArrayList;

import finalPackage.QueueConstructor.Node;

public class QueueConstructor {
	public class Node{
		//type of data put inside the node
		String data;
		
		//next of linked list
		Node next;
		
		Node tail;
	}
	static Node list;
	static Node firstNode;
	QueueConstructor() {
		//avoid nullpointerexception
		this.list = null;
	}
	public boolean isEmpty() {//checks for empty node
		return(list == null);
	}
	public void push(String string) {
		//sets new node with inputed data
		Node position = new Node();
		position.data = string;
		
		//adds next node to list node
		position.next = list;
		//resets top node
		list = position;
	}
	public void setFirstNode(String string) {
		//sets new node with inputed data
		Node position = new Node();
		position.data = string;
		
		firstNode = position;
	}
	public void pop() {//remove very first node
		ArrayList newArray = new ArrayList();
		Node temp = list;
		int x = 0;
		
		while(temp.next != null) {
			if(temp.next.data == firstNode.data) {
				newArray.add(temp.data);
//				System.out.println(newArray.get(x).toString()); --for debugging purposes
				setFirstNode(temp.data);

				break;
			}else {
				newArray.add(temp.data);
				temp = temp.next;
//				System.out.println(newArray.get(x).toString()); --for debugging purposes
				
			}
			x++;
		}
		temp = null;
		list = null;
		int y = newArray.size();
		for(int i = y; i > 0; i--) {
			push(newArray.get(y-1).toString());
			y--;
		}
		
	}
	public String toString() {
		Node check = list;
		Node previousNode = null;
		String returnString = "";
		while(check != null) {
			returnString+= " " + check.data;
			
			previousNode = check;
			//check node keeps changing it to the next node
			check = check.next;
			
			
		}
		return returnString;
	}


}