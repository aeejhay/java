/*
* CircleApp.java
* @author AJ.Mole
* 30/09/2024
*/

import java.util.Scanner;

public class circleApp{
	public static void main(String args[]){
		//Declare Variable
		double area, circumference;
		int radius;
		final double PI = 3.14168;

		//Declare and create onjects
		Scanner input = new Scanner(System.in);

		//Input
		System.out.println("Please enter the radius: ");
		radius = input.nextInt();

		//Process
		area = PI * radius * radius;
		circumference = 2 * PI * radius;

		//Output
		System.out.println("The circle with radius: " + radius
		+ "\nHas area: " + area
		+ "\nAnd circumference: " + circumference);


	}//main
}//class