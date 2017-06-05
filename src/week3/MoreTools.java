package week3;

import java.util.ArrayList;

public class MoreTools {

	public static void main(String[] args) {
		ArrayList<String> myThings = new ArrayList<String>();
		myThings.add("this");
		myThings.add("that");
		myThings.add("the other");
		System.out.println(myThings);
		
		myThings.clear();
		System.out.println(myThings);
		
		//replacing something in the list
		myThings.set (1, "foo");
		System.out.println(myThings);
		
		//inserting something to the list
		myThings.add(2, "bar");
		System.out.println(myThings);
		
		//remove by index
		myThings.remove(2);
		System.out.println(myThings);
		
		//remove by value, just removes the first one
		myThings.remove("foo");
		System.out.println(myThings);
		
		//remove all
		myThings.add("foo");
		myThings.add("foo");
		System.out.println(myThings);
		while (myThings.contains("foo")){
			myThings.remove("foo");
		}
				
	}
	public static ArrayList<String> buildDemoList() {
		ArrayList<String> demoList = new ArrayList<String>();
		demoList.add("this");
		demoList.add("that");
		demoList.add("the other");
		return demoList;
		
	}
}
