/*
* CalculatorApp.java
* @author AJ.Mole
* 30/09/2024
*/

import javax.swing.JOptionPane;
public class CalculatorApp {

    public static void main(String[] args) {
        // Declare the variable
        int x, y, sum, diff;

        //Declare and create object
        Calculator myCal = new Calculator();

        // Input
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number: "));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number: "));


        // Process
        myCal.setX(x);
        myCal.setY(y);
        myCal.compute();

        // Output
        sum = myCal.getSum();
        diff = myCal.getDiff();
        JOptionPane.showMessageDialog(null, "x: " + x
        + "\ny: " + y
        + "\nAdded: " + sum
        + "\nSubtracted: " + diff);


    }//main
}//class
