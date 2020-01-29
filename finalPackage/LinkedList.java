package finalPackage;

import finalPackage.LinkedList.Node;

public class LinkedList {
	private static LinkedList newList;
	public LinkedList(){
		newList = new LinkedList();
	}
	Node head;
	
	private int size = 10;
	static class Node{ //constructor
		int data;
		Node next;
		Node (int d){/* Constructor to create a new node 
		Next that is by default initialized as null */

			data = d;
			next = null;
		}
	}
	public void printList() {
		Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
	}
	public static void createList() {
		
		
		newList.head = new Node(1);
		Node nodeTwo = new Node(2);
		Node nodeThree = new Node(3);
		/* Three nodes have been allocated dynamically. 
        We have references to these three blocks as head,   
        second and third 

        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  | null |     | 2  | null |     |  3 | null | 
       +----+------+     +----+------+     +----+------+ */
		/*Now set node to the next*/
		newList.head.next = nodeTwo;
		nodeTwo.next = nodeThree;
		//addItem();
		newList.printList();
	}
//	public void addItem() {
//		//add data to stack
//		for(int i = 0; i <= size;i++) {
//			newList.add(
//					new String( Character.toString('a' + i)) // push stack (characters, numbers, etc)
//					);  
//			System.out.println("" + newList);
//		}
//	}
}
