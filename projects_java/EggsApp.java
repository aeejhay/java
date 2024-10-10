/*
* EggsApp.java
* @author AJ.Mole
* 30/09/2024
*/

import javax.swing.JOptionPane;
public class EggsApp {

    public static void main(String[] args) {
        // Declare the variable
        int totalEggs, numberBoxes, numLO;

        // Input
        totalEggs = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of eggs: "));

        // Process
        numberBoxes = totalEggs / 12;
        numLO = totalEggs % 12;

        // Output
        JOptionPane.showMessageDialog(null, "Total number of eggs collected: " + totalEggs
        + "\nNumber of boxes needed: " + numberBoxes
        + "\nLeftover eggs: " + numLO);


    }//main
}//class
