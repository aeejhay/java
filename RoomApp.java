/*
* RoomApp.java
* @author AJ.Mole
* 27/09/2024
*/

public class RoomApp{
	public static void main(String args[]){

		//Declare variable
		int length = 342, width = 234, area, perimeter;

		//Input

		//Process
		area = length * width;
		perimeter = 2*(length + width);

		//Ouput
		System.out.println("For room with length: " + length
							+ "\nand width: " + width
							+ "\nhas area: " + area
							+ "\nand perimeter: " + perimeter);

	}//main
}//class