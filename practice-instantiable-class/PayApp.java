/*
* PayApp.java
* @author Enda
* 3/10/24
*/

import javax.swing.JOptionPane;

public class PayApp{
	public static void main(String [] args){
		// Declare variables
		double basicPayRate, basicHours, overtimeHours, totalPay, ovetimePayRate;

		//Declare and create objects
		Pay myC = new Pay(); //this is the class we creted

		//Input
		basicPayRate = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter basic Pay Rate: "));
		basicHours = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter how many hours you work?: "));
		overtimeHours = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter how many hours overtime work?: "));

		//Process we used already the class with name from Instantiable class
		myC.setBasicPayRate(basicPayRate);
		myC.setBasicHours(basicHours);
		myC.setOvertimeHours(overtimeHours);
		myC.compute();

		//Output
		basicPayRate = myC.getBasicPayRate();
		overtimeHours = myC.getOvertimePay();
		totalPay = myC.gettotalPay();

		JOptionPane.showMessageDialog(null, "Total Basic Pay: " + basicPayRate
						+ "\nTotal Overtime Pay: " + overtimeHours
						+ "\nTotal Pay: " + totalPay);

	} // main
} // class