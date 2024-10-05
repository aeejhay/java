/*
* ChangeApp.java
* @author AJ.Mole
* 03/10/2024
*/

import javax.swing.JOptionPane;

public class ChangeApp{
	public static void main(String args[]){
		//Declare Variable
		int cash, cost, change, num50, num20, num10, num5, num2, num1, leftOver;

		//Input
		cost = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the cost of the goods : "));
		cash = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the cash tendered: "));

		//Process
		change = (int) cash - cost;
		leftOver = change;

		num50 = change / 50;
		leftOver = leftOver % 50;

		num20 = change / 20;
		leftOver = leftOver % 20;

		num10 = change / 10;
		leftOver = leftOver % 10;

		num5 = change / 5;
		leftOver = leftOver % 5;

		num2 = change / 2;
		leftOver = leftOver % 2;

		//Output
		JOptionPane.showMessageDialog(null, "Cash: " + cash
										+ "\nCost: " + cost
										+ "\nChange: " + change
										+ "\nNum50s : " + num50
										+ "\nNum20s : " + num20
										+ "\nNum10s : " + num10
										+ "\nNum5s : " + num5
										+ "\nNum2s : " + num2
										+ "\nNum1s : " + leftOver);
	}//main
}//class}