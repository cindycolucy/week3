package week3;

import java.util.ArrayList;

public class Loopy {

	public static void main(String[] args) {
		
		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");


		
		//enhanced for loop
		for (String word: giantWords){
			System.out.print(word + "! ");
		}

	}

}
