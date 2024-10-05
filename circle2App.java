/*
* Circle2App.java
* @author AJ.Mole
* 30/09/2024
*/

import java.util.Scanner;

public class circle2App{
	public static void main(String args[]){
		//Declare Variable
		double area, circumference, radius;
		int diameter;
		final double PI = 3.14168;

		//Declare and create onjects
		Scanner input = new Scanner(System.in);

		//Input
		System.out.println("Please enter the diameter: ");
		diameter = input.nextInt();

		//Process, below is casting (data type)
		radius = (double)diameter / 2;
		area = PI * radius * radius;
		circumference = 2 * PI * radius;

		//Output
		System.out.println("The circle with radius: " + radius
		+ "\nHas area: " + area
		+ "\nAnd circumference: " + circumference);

	}//main
}//class