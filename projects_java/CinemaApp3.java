/*
* CinemaApp3.java
* @author AJ.Mole
* 11/10/2024
*/

import javax.swing.JOptionPane;

public class CinemaApp3{
	public static void main(String args[]){
		//Declare Variable
		int age;

		//Input
		age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age : "));

		//Process & Output

		if((age < 5) || (age > 65)){
			JOptionPane.showMessageDialog(null, "You get free admission");
		}
		else if(age >=5 && age <=14){
			JOptionPane.showMessageDialog(null, "Your admission fee is 5 Euro");
		}
		else{
			JOptionPane.showMessageDialog(null, "Your admission fee is 10 Euro");
		}

		//Output

	}//main
}//class}