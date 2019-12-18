package s073;

public class Tail { // questo codice è pensato perché la size sia immutabile. dopo il costruttore
					// che inizializza la size, questa non viene più modificata, la proprietà è
					// private, quindi non potrà cambiare. 
	private int size;

	public Tail(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Tail [size=" + size + "]";
	}
}
