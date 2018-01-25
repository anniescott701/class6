package class6;

public abstract class animalabstract {
	String color;
	String breed;
	String name;

	abstract void eat();

	public void speak() {
		System.out.println("animal eats food");
	}

	public static void main(String[] args) {
		animalabstract a1 = new dogabstract();

		a1.eat();
		a1.speak();
	}
}
