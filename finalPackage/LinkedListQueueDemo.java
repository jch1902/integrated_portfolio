package finalPackage;

import java.util.*;

public class LinkedListQueueDemo {
	private static QueueConstructor newList;
	private static ArrayList printedString;
	public LinkedListQueueDemo(){
		newList = new QueueConstructor();
	}
	public static void createList() {
		String[] shoppingList = {"Apple","Avacodo","Grapes","Bananas"};
		int x = 0;
		printedString = new ArrayList();
		
		System.out.println("Shopping List: " + newList);
		printedString.add("Shopping List: " + newList);
		for(int i = 0; i < shoppingList.length; i++) {
				newList.push(shoppingList[x]);
				newList.setFirstNode(shoppingList[0]);//if first node set it to a diff node
			System.out.println("Shopping List: (Added " + shoppingList[x] + ") "+ newList);
			printedString.add("Shopping List: (Added " + shoppingList[x] + ") "+ newList);
			x++;
		}
		
		System.out.println("Shopping list is full. Let's go buy stuff and remove it from the list.");
		printedString.add("Shopping list is full. Let's go buy stuff and remove it from the list.");
		x = 0;
		for(int i = 0; i < shoppingList.length; i++) {
			
			newList.pop();
			if(newList != null) {
				System.out.println("Shopping List: (Bought " + shoppingList[x] + ") " + newList);
				printedString.add("Shopping List: (Bought " + shoppingList[x] + ") " + newList);
			}else {
				System.out.println("Shopping List: Empty ");
			}
			x++;
			
		}
	}
	public String returnArrayList() {
		String newString = "";
		int x = 0;
		for(int i = 0; i < printedString.size(); i++) {
			newString += printedString.get(x).toString() + "\n";
			x++;
		}
		return newString;
	}
	
}
