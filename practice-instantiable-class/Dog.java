/*
* Dog.java
* @author Enda
* 3/10/24
*/

public class Dog{
	// Declare variables
	private String name;
	private String breed;
	private int age;


	// Constructor
	public Dog(){
	}

	public Dog(String name){
		this.name = name;
	}

	// Methods
	public void bark(){
		System.out.println("......bark");
	}

	public void setName(String name){
		this.name = name;
	}

	public void setBreed(String breed){
		this.breed = breed;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public String getBreed(){
		return breed;
	}

	public int getAge(){
		return age;
	}

} // class