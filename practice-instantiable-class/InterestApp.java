/*
* InterestApp.java
* @author Enda
* 3/10/24
*/

import javax.swing.JOptionPane;

public class InterestApp{
	public static void main(String [] args){
		// Declare variables
		int numMonths;
		double amount, interest, totalAmount;

		//Declare and create objects
		Interest myI = new Interest(); //this is the class we creted

		//Input
		numMonths = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number of months: "));
		amount = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the amount you owe: "));

		//Process we used already the class with name from Instantiable class
		myI.setNumMonths(numMonths);
		myI.setAmount(amount);
		myI.compute();

		//Output
		interest = myI.getInterest();
		totalAmount = myI.getTotalAmount();

		JOptionPane.showMessageDialog(null, "Interest: " + interest
						+ "\nTotal Amount you owe: " + totalAmount);

	} // main
} // class