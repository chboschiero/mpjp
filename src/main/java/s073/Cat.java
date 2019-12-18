package s073;

public class Cat extends Mammal {
	private Tail tail;

	public Cat(int gestationDays, int tailLen) {
		super(gestationDays); // il "super" è il modo per dire che stiamo risalendo la gerarchia; è un
								// costruttore che mi va a chiamare tutti i costruttori delle classi
								// sovraordinate. 
		this.tail = new Tail(tailLen);
	}

	@Override
	public String toString() {
		return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
	}
}
