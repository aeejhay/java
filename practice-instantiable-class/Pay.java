/*
* Pay.java (Instantiable Class)
* @author AJ.Mole
* 04/10/2024
*/

public class Pay{
	//Declare variables
	private double basicPayRate, basicHours, overtimeHours, totalPay, ovetimePayRate;

	//Constructor
	public Pay(){
		//default constructor
	}

	//Compute method
	public void compute(){
		basicPayRate = basicHours * basicPayRate;
		ovetimePayRate = overtimeHours * basicPayRate * 1.5;
		totalPay = basicPayRate + overtimeHours;
	}

	//Getters and setters ATTENTION ALWAYS CHECK DATA TYPES HERE
	public void setBasicPayRate(double basicPayRate){
			this.basicPayRate = basicPayRate;
		}

	public void setBasicHours(double basicHours){
				this.basicHours = basicHours;
		}

	public void setOvertimeHours(double overtimeHours){
				this.overtimeHours = overtimeHours;
		}

	public double getBasicPayRate(){
			return basicPayRate;
	}

	public double getOvertimePay(){
			return ovetimePayRate;
	}

	public double gettotalPay(){
			return totalPay;
	}

}//class