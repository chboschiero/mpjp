package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));

        System.out.println("s < t: " + s.compareTo(t)); // la compareTo "classica" si basa sull'ordine alfabetico
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t)); // stessa cosa di fare il + (che è tendenzialmente più comodo)

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3); // è come se in matematica fosse [) che significa chiuso a sx (quindi comprende quel carattere) e aperto a dx (quindi carattere non compreso)
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); // se non metto nulla come "end" vuol dire da lì in avanti

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2)); // quando si parla di reference il == si riferisce a due reference (che sono diversi), quindi non stamperà  

        System.out.println("First index of 'l' is s: " + s.indexOf('l')); // stampa il numero del primo indice corrispondente a quel carattere
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll")); // metto un backslash (\ carattere di escape) davanti per inserire un doppio apice all'interno di una stringa
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());

        System.out.println("s length: " + s.length());

        String s2 = s.replace('l', 'q'); 
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" "); // trasforma una stringa in array di stringhe in cui lo spazio bianco è il separatore (il separatore nel creare le stringhe poi sparisce)
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits); // trasforma un array di stringhe in una stringa unica; lo spazio bianco è il congiuntore, cioè ciò che viene fuori fra i pezzetti di stringa che voglio mettere assieme
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase()); // non cambia la stringa corrente, ma ne ritorna una copia tutta maiuscola
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]"); // elimina gli spazi bianchi all'inizio e alla fine della stringa
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x)); // converte la x nella sua rappresentazione stringa, quindi crea una stringa a partire dall'oggetto che gli passo
    }
}
