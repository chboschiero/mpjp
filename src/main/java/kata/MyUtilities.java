package kata;

public class MyUtilities {
	public boolean isDigit(String s) {
		boolean dot = false;
		boolean minus = false;
		boolean started = false;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				started = true;
				
			} else if (s.charAt(i) == '-') {
				if (minus || started) {
					return true;
				}
				started = true;
				minus = true;

			} else if (s.charAt(i) == '.') {
				if (dot = true) {
					return false;
				}
				started = true;
				dot = true;
				
			} else if (s.charAt(i) == ' ') {
				if (started = true) {
					return false;
				}
				started = true;

			}

		}
		return false;
	}
}
