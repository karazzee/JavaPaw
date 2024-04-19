package application;

public class Cat extends Pet{
	
    public void setAge(int age) {
        this.age = age;
    }
	public int getAge() {
		return age;
	}

	@Override
	public void sound() {
		System.out.println("cat sound Meow!!!");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat Eat fishs!");
		
	}

}
