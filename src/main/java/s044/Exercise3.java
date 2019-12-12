package s044;

public class Exercise3 {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8, 47, 24 };
		int counter = 0;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				++counter;
			} else {
				sum += array[i];
			}
		}

		System.out.println("Counter even= " + counter);

		System.out.println("Sum uneven= " + sum);
	}
}
