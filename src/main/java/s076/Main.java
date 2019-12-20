package s076;

public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom");
        Pet bill = new Pet("Bill", "brown");
        Dog bob = new Dog("Bob", "black", 10);

        String name = tom.getName();
        double speed = tom.getSpeed();

        System.out.println("Name and speed: " + name + ", " + speed);
        System.out.println("Color: " + tom.getColor());
        System.out.println(bill);
        System.out.println(bob);
        
    }
}
