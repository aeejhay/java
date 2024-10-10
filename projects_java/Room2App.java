/*
* Room2App.java
* @author AJ.Mole
* 27/09/2024
*/

import java.util.Scanner;

public class Room2App{
	public static void main(String args[]){
		//Declare variable
		int length, width, area, perimeter;

		Scanner user = new Scanner(System.in);

		// Declare and create object. User is the name of the object class Scanner. Once we have the object name, we can use the class methods using the syntax...objectName.methodName
        System.out.print("Enter Length: ");
        length = user.nextInt();
        System.out.print("Enter Width: ");
        width = user.nextInt();

		//Process
		area = length * width;
		perimeter = 2*(length + width);

		//Ouput
		System.out.println("For room with length: " + length
							+ "\nand width: " + width
							+ "\nhas area: " + area
							+ "\nand1 perimeter: " + perimeter);

	}//main
}//class