package week3;

import java.util.ArrayList;

public class BooleanArrayList {

	public static void main(String[] args) {

		ArrayList<Boolean> weather = new ArrayList<Boolean>();
		weather.add(true);
		weather.add(false);
		weather.add(false);
		weather.add(true);
		weather.add(false);
		System.out.println(weather);

		for (boolean b : weather) {
			if (b == true) {
				System.out.println("Better bring an umbrella.");
			} else {
				System.out.println("No rain today, enjoy the sun!");
			}

		}
	}
}
