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

        // Input
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number: "));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number: "));


        // Process
        sum = x + y;
        diff = x - y;

        // Output
        JOptionPane.showMessageDialog(null, "x: " + x
        + "\ny: " + y
        + "\nAdded: " + sum
        + "\nSubtracted: " + diff);


    }//main
}//class
