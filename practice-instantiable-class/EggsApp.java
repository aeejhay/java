/*
* EggsApp.java
* @author Enda
* 3/10/24
*/
//import javax.util.Scanner;
import javax.swing.JOptionPane;

public class EggsApp{
	public static void main(String [] args){
		// Declare variables
		int numEggs, leftOver, numBoxes ;

		//Declare and create objects
		//Scanner sc = new Scanner(System.in);
		Egg myE = new Egg(); //this is the class we creted

		//Input
		//System.out.println("Please enter total number of Eggs: ");
		//numEggs = sc.nextInt();
		numEggs = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter total number of Eggs: "));

		//Process
		myE.setNumEggs(numEggs); //we used already the class with name from Instantiable class
		myE.compute();

		//Output
		numBoxes = myE.getNumBoxes();
		leftOver = myE.getLeftOver();

		//System.out.println("Number of eggs collecte: " + numEggs
		//				+ "\nnumBoxes: " + numBoxes
		//				+ "\nnumLeftOver: " + leftOver
		//);

		JOptionPane.showMessageDialog(null, "Number of eggs collected: " + numEggs
						+ "\nnumBoxes: " + numBoxes
						+ "\nnumLeftOver: " + leftOver);

	} // main
} // class