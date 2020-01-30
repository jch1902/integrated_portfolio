package finalPackage;

import java.util.*;

public class LinkedListStackDemo {
	private static LinkedList<String> newList;
	private static ArrayList printedString;
	public LinkedListStackDemo(){
		newList = new LinkedList<String>();
	}
	public static void createList() {
		String[] wishList = {"Bike","Airpods","Macbook","Microphone"};
		int x = 0;
		printedString = new ArrayList();
		
		System.out.println("Wish List: " + newList);
		printedString.add("Wish List: " + newList);
		for(int i = 0; i < wishList.length; i++) {
			newList.push(wishList[x]);
			
			System.out.println("Wish List: (Added " + wishList[x] + ") "+ newList);
			printedString.add("Wish List: (Added " + wishList[x] + ") "+ newList);
			
			x++;
		}
		
		System.out.println("Wish list is full. Let's go buy stuff and remove it from the list.");
		printedString.add("Wish list is full. Let's go buy stuff and remove it from the list.");
		
		x = 0;
		for(int i = 0; i < wishList.length; i++) {
			newList.removeLast();
			if(newList != null) {
				System.out.println("Wish List: (Got " + wishList[x] + ") " + newList);
				printedString.add("Wish List: (Got " + wishList[x] + ") " + newList);
			}else {
				System.out.println("Wish List: Empty ");
			}
			x++;
		}
	}
	public String returnArrayList() {
		return printedString.get(0).toString() + "\n" + printedString.get(1).toString() + "\n"
				+ printedString.get(2).toString() + "\n"+ "\n";
	}
	
}
