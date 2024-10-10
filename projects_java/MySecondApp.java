/*
* MySecondApp.java
* @author AJ.Mole
* 26/9/24
*/

//import the class from java
import java.util.Scanner;

public class MySecondApp{
	public static void main(String args[]){
		// Declare variables
		String name;
		int age;

		//Declare and create object
		Scanner sc =  new Scanner(System.in);

		//Input
		System.out.println("Please Enter Your Name: ");
		name = sc.next();

		System.out.println("How old are you?: ");
		age = sc.nextInt();

		//Process & Output
		System.out.println("Mabuhay ka? Kamusta " + name + " you are " + age + " years old!");

	}//main
}//class