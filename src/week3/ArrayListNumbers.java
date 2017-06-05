package week3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(23);
		numbers.add(77);
		numbers.add(922);
		numbers.add(6);
		numbers.add(32);
		numbers.add(63);
		numbers.add(14);
		numbers.add(5);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println(numbers);

		if (numbers.contains(23)) {
			System.out.println("23 is in the list.");
		} else {
			System.out.println("23 is not in the list.");
		}
		if (numbers.contains(77)) {
			System.out.println("77 is in the list.");
		} else {
			System.out.println("77 is not in the list.");
		}
		if (numbers.contains(15)) {
			System.out.println("15 is in the list.");
		} else {
			System.out.println("15 is not in the list.");
		}

		//Integer twentyThree = 23;
		//numbers.remove(twentyThree);

		//Integer nineTwentyTwo = 922;
		//numbers.remove(nineTwentyTwo);

		//Integer thirtyTwo = 32;
		//numbers.remove(thirtyTwo);

		//Integer six = 6;
		//numbers.remove(six);

		System.out.println(numbers);

		//int index = numbers.indexOf(77);
		//numbers.remove(index);
		System.out.println(numbers);
		
		System.out.println(numbers);

	
	//Calling the method	
	checkList(numbers, 23);
	checkList(numbers, 77);
	checkList(numbers, 15);
	
	}
	
	//This method creates an array list of type integer, and declares an integer a.
	//Checks to see if number contains a
	public static void checkList(ArrayList<Integer> number, int a) {
		if (number.contains(a)) {
			System.out.println("This list contains " + a);
		}
		else {
			System.out.println("This list does not contain " + a);
		}
	}
}
