package s077;

public class Exercise {
	public static void main(String[] args) {
		Pet[] pets = new Pet[3];
		pets[0] = new Dog("Mary");
		pets[1] = new Cat("Jesus");
		pets[2] = new Lion("Roger");

		for (int i = 0; i < pets.length; i++) {
			if (pets[i] instanceof Dog) {
				Dog dog = (Dog) pets[i];
				dog.bark();
			} else if (pets[i] instanceof Cat) {
				Cat cat = (Cat) pets[i];
				cat.meow();
			} else if (pets[i] instanceof Lion) {
				((Lion) pets[i]).roar();
			} else {
				System.out.println("Unknown Pet");
			}
		}

		for (Pet cur : pets) {
			if (cur instanceof Dog) { // ((Dog) pet).bark();
				Dog dog = (Dog) cur;
				dog.bark();
			} else if (cur instanceof Cat) {
				Cat cat = (Cat) cur;
				cat.meow();
			} else {
				System.out.println("Unknown Pet");
			}

		}
	}

}
