package finalPackage;

import java.util.*;

public class LinkedListQueueDemo {
	private static LinkedList<String> newList;
	public LinkedListQueueDemo(){
		newList = new LinkedList<String>();
	}
	public static void createList() {
		String[] shoppingList = {"Apple","Avacodo","Grapes","Banannas"};
		int x = 0;
		System.out.println("Shopping List: " + newList);
		for(int i = 0; i < shoppingList.length; i++) {
			newList.push(shoppingList[x]);
			System.out.println("Shopping List: (Added " + shoppingList[x] + ") "+ newList);
			x++;
		}
		System.out.println("Shopping list is full. Let's go buy stuff and remove it from the list.");
		for(int i = 0; i < shoppingList.length; i++) {
			x--;
			newList.pop();
			if(newList != null) {
				System.out.println("Shopping List: (Bought " + shoppingList[x] + ") " + newList);
			}else {
				System.out.println("Shopping List: Empty ");
			}
			
		}
	}
	
}
