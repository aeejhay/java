/*
* Interest.java (Instantiable Class)
* @author AJ.Mole
* 04/10/2024
*/

public class Interest{
	//Declare variables
	private int numMonths;
	private double amount, interest, totalAmount;
	private final double RATE = 0.03;

	//Constructor
	public Interest(){
		//default constructor
	}

	//Compute method
	public void compute(){
		interest = numMonths * RATE * amount;
		totalAmount = amount + interest;
	}

	//Getters and setters ATTENTION ALWAYS CHECK DATA TYPES HERE
	public void setNumMonths(int numMonths){
			this.numMonths = numMonths;
		}

	public void setAmount(double amount){
			this.amount = amount;
		}


	public double getInterest(){
			return interest;
	}

	public double getTotalAmount(){
			return totalAmount;
	}

}//class