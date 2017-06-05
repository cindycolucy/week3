package shopping;

public class CartItem {

	//instance variables
	String name;
	double pricePerItem;
	int quantity;
	
	
	//constructor
	public CartItem(String itemName, double itemPrice, int itemQuantity) {
		name = itemName;
		pricePerItem = itemPrice;
		quantity = itemQuantity;
	}
	
	//method to get total price
	public double totalPrice(){
		return pricePerItem * quantity;
	}
	
	//toString() gives us a String representation
	public String toString() {
		return quantity + " " + name + " @ $ " + pricePerItem;
	}
	}


