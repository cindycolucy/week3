import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapExercises {

	public static void main(String[] args) {

		Map<String, BigDecimal> items = new HashMap<String, BigDecimal>();
			
		items.put("Spaghetti", new BigDecimal ("8.97"));
		items.put("Lasagna", new BigDecimal ("10.98"));
		items.put("Pizza", new BigDecimal ("15.50"));
		items.put("Caesar Salad", new BigDecimal ("7.00"));
		items.put("Kale Salad", new BigDecimal ("7.00"));

		System.out.println(items);

		// question 1
		BigDecimal spaghettiPrice = items.get("Spaghetti");
		System.out.println("The price for spaghetti is $" + spaghettiPrice);

		// question 2
		System.out.println("There are " + items.size() + " menu items.");

		// question 3
		items.put("Bottle of Champagne", new BigDecimal ("200.00"));
		items.put("Bottle of Vintage Wine", new BigDecimal ("175.00"));

		BigDecimal champagnePrice = items.get("Bottle of Champagne");
		System.out.println("The price for a Bottle of Champagne is $" + champagnePrice);

		BigDecimal winePrice = items.get("Bottle of Vintage Wine");
		System.out.println("The price for a Bottle of Vintage Wine is $" + winePrice);

		// question 4
		if (items.containsKey("Bottle of Champagne"));
		System.out.println("Yes, we have champagne.");

		// question 5
		if (items.containsValue(13.50)) {
			System.out.println("We do have a menu item that is $13.50.");
		} else {
			System.out.println("We do not have a menu item that is $13.50.");
		}
		// question 6
		items.remove("Kale Salad");
		System.out.println(items);
		
		//question 7
		items.clear();
		System.out.println(items);
		
		if (items.isEmpty()){
			System.out.println("There are no items on the menu.");
		}

	}
}
