package s048;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10]; // se invece scrivo Dog[] dogs = {new Dog} ho creato un array con una cella inizializzata con reference a dog
		
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
		}

		dogs[5].bark();
	}

}