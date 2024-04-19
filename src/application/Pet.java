package application;

//Pet Class
public abstract class Pet  {
	public String name;
	public String color;
	public int age;
	public String breed;
    private String privateField;

	public enum shape {BIG,MEDIUM,SMALL,UNKNOWN};
	 
	public abstract void sound();
	public abstract void eat();
}

