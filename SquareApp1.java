/*
* SquareApp.java
* @author AJ.Mole
* 27/09/2024
*/

import java.util.Scanner;

public class SquareApp1{
	public static void main(String args[]){
		int length, area;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = scanner.nextInt();
		//Declare variable


		//Process
		area = length * length;

		//Ouput
		System.out.println("The area of square, of length: " + length + ", is: " + area);

	}//main
}//class