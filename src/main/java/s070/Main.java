package s070;

public class Main {
	public static void main(String[] args) {
		Barker[] barkers = new Barker[2]; // array di referenze all'interface, posso mettere dentro solamente oggetti 
											// che implementano barker

		barkers[0] = new Fox();
		barkers[1] = new Dog();

		for (Barker barker : barkers) {
			System.out.println(barker.bark());
		}

		BarkAndWag baw = new Dog();
		System.out.println(baw.tailWaggingSpeed());

		Dog dog = new Dog();
		System.out.println(dog.bark(3));
	}
}
