
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetStuff {
	
	public static void main(String[] thisIsTheVariableNameThatNeverEndsItJustGoesOnAndOnMyFriends) {
		
		//Create new TreeSet, which inherits from Set
		Set<Integer> set = new TreeSet<Integer>();
		
		//Create an ArrayList, which inherits from List
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//Add data to list
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(8);
		
		for (int i = 0; i < arr.size(); ++i) {
			set.add(arr.get(i));
		}
		
		//Print contents of the set, showing that the duplicate value of 8 was not added to set
		//while everything else was.
		System.out.println("List: " + arr);
		System.out.println("With duplicate values removed: " + set);
		
		System.out.print("\n");
		
		//Example of HashMap and TreeMap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//Add some data, where putting in an integer key gives that key squared
		for (int i = 1; i <= 5; ++i) {
			hashMap.put(i, Integer.toString(i) + " is a number");
			treeMap.put(i, Integer.toString(i) + " is a number");
		}
		
		//Print hashMap and treeMap
		System.out.println("The HashMap: " + hashMap);
		System.out.println("The TreeMap: " + treeMap);
		
		//Although the printed results were the same, HashMap does not necessarily retain the order
		//that the elements were put in, while TreeMap does. As a result, treeMap should be used
		//to ensure the order of key, value pairs.

	}

}
