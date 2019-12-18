package s073;

public abstract class Mammal { // se non è specificato, la classe estende la classe "Object"
	protected int gestation;

	public Mammal(int gestation) { // questo metodo è un costruttore e lo si capisce perché ha lo stesso nome della
									// classe e non ha return type
		this.gestation = gestation; // voglio mettere il valore che mi passa l'utente nella proprietà che appartiene
									// alla classe. in questo caso assegna a this.gestation il valore che ha passato
									// l'utente
	}

	@Override
	public String toString() {
		return "Mammal [gestation=" + gestation + "]";
	}
}
