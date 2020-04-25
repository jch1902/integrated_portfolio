package finalPackage;

import java.util.ArrayList;

public class PackageSorter {
	 enum ListType {Standard, Insert};
    ListType listType = ListType.Standard;
    private int[] packageIDList; int icompares = 0; int iswaps = 0;
    
	void InsertionSort() {

        // iterate list, one less than length
        for (int i = 0; i < packageIDList.length - 1; i++) {
            
            // insertion sort key logic
            int k = i + 1;
            int swap = packageIDList[k];            
            while( k > 0 && swap < packageIDList[k-1]) {
                packageIDList[k] = packageIDList[k-1];
                k--;
                
                // analytics
                this.icompares++; // compare counter
                this.iswaps++; // shift counter
            }
            packageIDList[k] = swap;
            
            this.iswaps++;  // increment swap counter
            
        }
    }
	public void addItems() {
		int size = 5;
		int increment = 0;
        packageIDList = new int[size];
        for (int i = 0; i < packageIDList.length; i++) {
        	String currentID = "";
        	for (int x = 0; x < packageIDList.length; x++) {
        		currentID += (int)(Math.random()*5);
        	}
        	packageIDList[increment] = Integer.valueOf(currentID);
        	increment++;
        }
            
	}
	public String toString() {
		int[] list;
		list = this.packageIDList;
		String output = "[";
        for (int i = 0; i < list.length; i++)
            output += " " + list[i];
        return output +" ]"; 
	}
	public ArrayList getItems(){
		ArrayList newArray = new ArrayList();
		int[] list = this.packageIDList;
        for (int i = 0; i < list.length; i++)
            newArray.add("Package ID: [" + list[i] + "]"); 
		return newArray;
	}
}
