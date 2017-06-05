package week3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOrder {

	public static void main(String[] args) {

		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("apple");
		giantWords.add("cat");
		giantWords.add("bear");
		
		Collections.sort (giantWords);
		
		System.out.println(giantWords);
	}
}
