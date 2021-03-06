package ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S59Test {

	@Test
	void sumPositive() {
		long actual = S59.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumBillion() {
		long actual = S59.sum(2_000_000_000, 2_000_000_001);

		assertThat(actual, is(4_000_000_001L));
	}

	@Test
	void sumNegPos() {
		long actual = S59.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S59.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
		long actual = S59.sum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumPositive() {
		long actual = S59.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S59.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S59.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S59.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S59.factorial(4);

		assertThat(actual, is(24L));
	}

	@Test
	void factorialNegative() {
		long actual = S59.factorial(-4);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacci() {
		long actual = S59.fibonacci(6);

		assertThat(actual, is(8L));
	}

	@Test
	void multiplicationTable() {
		int[][] actual = S59.multiplicationTable(3);

		int[][] expected = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };

		assertEquals(expected.length, actual.length);
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i].length, actual[i].length);
		}
		for (int i = 0; i < expected.length; i++) {
			for (int j = 0; i < expected.length; i++) {
				assertEquals(expected[i][j], actual[i][j]);
			}

			assertThat(actual[0][0], is(1));
			assertThat(actual[2][2], is(9));
		}

	}
}
