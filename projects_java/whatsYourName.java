/*
*
*
*/

import java.util.Scanner;

public class whatsYourName{
	public static void main(String args[]){
		//Declare and create onject
		//This creates the link to the Scanner code
		//..so that we can get input from the user
		Scanner scanner = new Scanner(System.in);
		//Input
		System.out.print("Enter Your Name: ");
		String name = scanner.next();
		//Process and Input
		System.out.println("Hello Mabuhay ka " + name);
		//Close scanner
		scanner.close();

	}//main

}//class