package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<CartItem> items = new ArrayList<CartItem>();
	
	
	
	//method to add item to cart
		public void addItem(CartItem item){
			items.add(item);
			
		}
		//to string method for cart items
		public String toString(){
			return "Cart with items: " + items;
		}
		
		//method to create total price
		public double totalPrice(){
			double cartPrice = 0;
			for(CartItem currentItem: items){
				cartPrice = cartPrice + currentItem.totalPrice();
			}
			return cartPrice;
		}
		
	}


