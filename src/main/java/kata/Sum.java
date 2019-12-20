package kata;

public class Sum {

	public static int arrayPlusArray(int[] arr1, int[] arr2) {

		int counter = 0;
		for (int item : arr1) {
			counter += item;
		}
		for (int item : arr2) {
			counter += item;
		}
		return counter;
	}

}