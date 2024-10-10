/*
* MyFirstApp.java
* @author Enda
* 3/10/24
*/
import java.util.Scanner;

public class MyFirstApp{
	public static void main(String [] args){
		// Declare variables
		String name, message;
		int age;

		//Declare and create objects
		Scanner sc = new Scanner(System.in);
		MyFirst myM = new MyFirst(); //this is the class we creted

		//Input
		System.out.println("Please enter your name");
		name = sc.next();

		System.out.println("Please enter your age");
		age = sc.nextInt();

		//Process
		myM.setName(name); //we used already the class with name from Instantiable class
		myM.setAge(age);

		myM.compute();

		//Output
		message = myM.getMessage();

		System.out.println(message);

	} // main
} // class