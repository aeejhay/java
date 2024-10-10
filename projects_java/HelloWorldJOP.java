/*
* HelloWorld.java
* @author AJ.Mole
* 27/09/2024
*/

import javax.swing.JOptionPane;

public class HelloWorldJOP{
	public static void main(String args[]){
		//Declare variables
		String name;
		int age;

		//Input
		name = JOptionPane.showInputDialog(null, "Enter your name: ");
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));

		//Ouput
		JOptionPane.showMessageDialog(null, "Hello " + name + "\nYour age is " + age);

	}//main
}//class

