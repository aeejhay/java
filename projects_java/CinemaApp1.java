/*
* CinemaApp1.java
* @author AJ.Mole
* 11/10/2024
*/

import javax.swing.JOptionPane;

public class CinemaApp1{
	public static void main(String args[]){
		//Declare Variable
		int age;

		//Input
		age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age : "));

		//Process & Output

		if (age>100){
			JOptionPane.showMessageDialog(null, "Congratulations you have free admission!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry you need to pay!");
		}

		//Output

	}//main
}//class}