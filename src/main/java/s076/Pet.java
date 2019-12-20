package s076;

public class Pet {
	private static final String DEFAULT_COLOR = "pink";
	private static final String DEFAULT_NAME = "MyPet";
	private String name;
	public String color;

	public Pet() {
		this(DEFAULT_NAME);
	}

	public Pet(String name) {
		this(name, DEFAULT_COLOR);
	}

	public Pet(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "S75Pet [name=" + name + ", color=" + color + "]";
	}
}