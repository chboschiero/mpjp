package s070;

public class Dog implements BarkAndWag {
	@Override
	public String bark() {
		return "woof!";
	}

	public String bark(int count) { // la signature di un metodo è fatto da un nome e dalla lista dei parametri.
									// quindi questo bark è diverso dal bark con "override"
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; i++) {
			sb.append(bark());
		}

		return sb.toString();
	}

	@Override
	public int tailWaggingSpeed() {
		return BarkAndWag.AVG_WAGGING_SPEED;
	}
}