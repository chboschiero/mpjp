package kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import s049.Exercise;

class EvenNumbersTest {

	@Test
	public void testSimple() {
		int[] divisible = EvenNumbers.divisibleBy(new int[] { 1, 2, 3, 4, 5, 6 }, 2);

		Assertions.assertEquals(3, divisible.length);
		Assertions.assertEquals(2, divisible[0]);
	}
}