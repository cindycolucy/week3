package shopping;

public class ShoppingCartApp {

	public static void main(String[] args) {
		
		//creating object cart
		Cart cart = new Cart();

		//creating object items
		CartItem mangoes = new CartItem ("mango", 1.25, 4);
		System.out.println(mangoes);
		//call method to add mangoes to cart
		cart.addItem(mangoes);
		System.out.println("Total for mangoes is " + mangoes.totalPrice());
		
		CartItem bananas = new CartItem ("banana", 1.00, 3);
		cart.addItem(bananas);
		System.out.println(bananas);
		System.out.println("Total for bananas is " + bananas.totalPrice());
		
		CartItem avocados = new CartItem ("avocado", 1.75, 5);
		cart.addItem(avocados);
		System.out.println(avocados);
		System.out.println("Total for avocados is " + avocados.totalPrice());
		
		System.out.println(cart);
		
		System.out.println("Total price is " + cart.totalPrice());
		
		
		
		
	}

}
