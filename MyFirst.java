/*
* MyFirst.java (Instantiable Class)
* @author AJ.Mole
* 04/10/2024
*/

public class MyFirst{
	//Declare variables (1)
	private String name, message;
	private int age;

	//Constructor (3)
	public MyFirst(){
		//default constructor
	}

	//Compute method (4)
	public void compute(){
		message = "Hello " + name + ", you are " + age + " years old.";
	}

	//Getters and setters (2)
	public void setName(String name){
				this.name = name;
		}

	public void setAge(int age){
				this.age = age;
	}

	public String getMessage(){
				return message;
	}

}//class