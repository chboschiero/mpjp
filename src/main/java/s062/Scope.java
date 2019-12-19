package s062;

public class Scope {
	private static int staticMember = 5; // statico = esiste a prescindere che ci sia un oggetto di quel tipo
	private long member = 5;

	public void f() {
		int local = 7; // questa local non ha a che fare con la local che troviamo nel metodo g()
		if (staticMember == 2) {
			short inner = 12;
			staticMember = 1 + inner;
			member = 3 + local;
		}
	}

	public void g() {
		System.out.println(member);
	}

	public static void main(String[] args) {
		double local = 5;
		System.out.println(local);
		staticMember = 12;
		Scope scope = new Scope();

	}
} 
