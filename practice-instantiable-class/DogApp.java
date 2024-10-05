/*
* DogApp.java
* @author Enda
* 3/10/24
*/
import java.util.Scanner;

public class DogApp{
	public static void main(String [] args){
		// Declare variables
		Scanner sc = new Scanner(System.in);
		Dog nando = new Dog();

		nando.setName("nando");

		System.out.println("Object nando name: " + nando.getName());

		nando.bark();
		Dog aney = new Dog();
		aney.bark();


	} // main
} // class