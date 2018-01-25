package class6;

public class dogabstract extends animalabstract
{
	
	public void speak() 
	{
		System.out.println("dog barks");
	}

	@Override
	void eat() {
		System.out.println("dog eats pedigree");
		super.speak();
		
	}
}
