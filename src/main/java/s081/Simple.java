package s081;

public class Simple {
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}

	public int negate2(int value) throws MyNegateException {
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);
		}
		return -value;

	}

	public static void main(String[] args) {
		Simple simple = new Simple();
		try {
			int value = Integer.parseInt(args[0]);
			System.out.println("Negate " + value);
			int x = simple.negate2(value);
			System.out.println("My value negated is: " + x);
		} catch (MyNegateException mne) {
			System.out.println("My value negated is close to: " + mne.getAlternativeValue());
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Pass me an integer, you stupid!");
			return;
		}
		System.out.println("Well done!");

	}

	class MyNegateException extends Exception {
		private static final long serialVersionUID = 1L;
		private int alternativeValue;

		public MyNegateException(int alternativeValue) {
			this.alternativeValue = alternativeValue;
		}

		public int getAlternativeValue() {
			return alternativeValue;
		}
	}
}
