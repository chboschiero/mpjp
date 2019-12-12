package s044;

public class Exercise4 {
	public static void main(String[] args) {
		int[] array = { 5, 17, 1, 3, 4 };
		boolean one = false;
		boolean seven = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				System.out.println("1 è in posizione " + i);
				one = true;
			}
		}
		if (!one) {
			System.out.println("not found 1");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				System.out.println("7 è in posizione " + i);
				seven = true;
			}
		}
		if (!seven) {
			System.out.println("Not found 7");

		}
	}

}
