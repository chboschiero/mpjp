package s050;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(20); // il numero è la capacità dello string builder
        StringBuilder sb3 = new StringBuilder("hello");
        
        System.out.println("capacity 1: " + sb.capacity());
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity());
        
        System.out.println("appending: " + sb3.append(' ').append("world")); // posso fare un "trenino" di chiamata (perché append è un metodo che mi ritorna un riferimento a se stesso)
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'");
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2));
        
        System.out.println("index of \"elo\": " + sb3.indexOf("elo"));
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c"));// permette di inserire una stringa a partire da una data posizione
        
        System.out.println("current sb3 length: " + sb3.length());
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r"));
        
        System.out.println("reversing: " + sb3.reverse());
        
        sb3.setCharAt(5, 'a');
        System.out.println("setCharAt: " + sb3);
        
        sb3.setLength(3);
        System.out.println("setLength: " + sb3);
    }
}
