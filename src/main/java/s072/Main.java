package s072;

public class Main {
	public static void main(String[] args) {
		// Cannot instantiate
//        Abstract ma = new Abstract();
//        Abstract2 ma2 = new Abstract2();

		Abstract ma = new Concrete(); // vedo il gatto concreto come se fosse un gatto generico, quindi in realtà
										// lavoro sul gatto generico
		ma.anAbstractMethod();

		Abstract2 ma2 = new Concrete2();
		ma2.aConcreteMethod();
	}
}
