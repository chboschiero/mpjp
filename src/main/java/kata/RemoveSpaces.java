package kata;

public class RemoveSpaces {
	static String noSpace(final String x) {
		StringBuilder x1 = new StringBuilder();

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) != ' ') {
				x1.append(x.charAt(i));
			}
		}

		return x1.toString();
	}

	static String noSpace1(final String x) {

		return x.replaceAll(" ", "");
	}
	
	static String noSpace2(final String x) {
		StringBuilder x1 = new StringBuilder();

		for (int i = 0; i < x.length(); i++) {
			if (!Character.isWhitespace(x.charAt(i))) {
				x1.append(x.charAt(i));
			}
		}

		return x1.toString();
	}
}
