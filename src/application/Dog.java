package application;

public class Dog  extends Pet{

	@Override
	public void sound() {
		System.out.println("Dog Sound:Woof~ Woof~ Woof~");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog Eat bones!");
		
	}
	
}
