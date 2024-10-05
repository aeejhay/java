/*
* Calculator.java (Instantiable Class)
* @author AJ.Mole
* 04/10/2024
*/

public class Calculator{
	//Declare variables
	private int x, y, sum, diff;

	//Constructor
	public Calculator(){
		//default constructor
	}

	//Compute method
	public void compute(){
		sum = x + y;
        diff = x - y;
	}

	//Getters and setters
	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getSum(){
			return sum;
	}

	public int getDiff(){
			return diff;
	}

}//class