/*
* CinemaApp2.java
* @author AJ.Mole
* 11/10/2024
*/

import javax.swing.JOptionPane;

public class CinemaApp2{
	public static void main(String args[]){
		//Declare Variable
		int age;

		//Input
		age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age : "));

		//Process & Output

		if (age<14){
			JOptionPane.showMessageDialog(null, "Your admission fee is 15 Euro");
		}
		else{
			JOptionPane.showMessageDialog(null, "Your admission fee is 30 Euro");
		}

		//Output

	}//main
}//class}