package parrots;

public class Parrots {

	public static void main(String[] args) {

		//creating object
		Parrot myParrot = new Parrot ();
		myParrot.name = "Dewd";
		
		
		//calling method
		Parrot anotherDewd = createParrot("Dewd");

	}
	//method
	public static Parrot createParrot(String input){
		Parrot p = new Parrot();
		p.name = input;
		return p;
	}

}
