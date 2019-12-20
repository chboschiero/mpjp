package s076;

public class Dog extends Pet {
    private double speed;

    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, double speed) {
        super(name);
        this.speed = speed;
    }
    public Dog(String name, String color, double speed) {
        this(name, speed);
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }
    
    @Override
	public String toString() {
		return "S75Dog " + super.toString() + speed;
	}
}