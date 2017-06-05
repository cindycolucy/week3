package week3;

import java.util.ArrayList;

public class GuestList {

	public static void main(String[] args) {

		ArrayList<String> guests = new ArrayList<String>();
		guests.add("Smith");
		guests.add("Jones");
		guests.add("Johnson");
		guests.add("Jones");
		guests.add("Morrison");
		System.out.println(guests);

		for (String guestName : guests) {
			if (guestName.equals("Jones")) {

				int guestIndex = guests.indexOf("Jones");
				System.out.println(guestIndex);
				guests.set(guestIndex, "Peterson");
				System.out.println(guests);
			}
		}
		
		checkList(guests, "Jones");
	}
	public static void checkList (ArrayList<String> names, String surname){
		if (names.contains(surname)){
			System.out.println ("This list contains " + surname);
		}
		else {
			System.out.println ("This list does not contain " + surname);
		}
	}

}
