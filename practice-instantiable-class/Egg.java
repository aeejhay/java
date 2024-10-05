/*
* Egg.java (Instantiable Class)
* @author AJ.Mole
* 04/10/2024
*/

public class Egg{
	//Declare variables (1)
	private int numEggs, leftOver, numBoxes ;

	//Constructor (3)
	public Egg(){
		//default constructor
	}

	//Compute method (4)
	public void compute(){
		numBoxes = numEggs / 12;
		leftOver = numEggs % 12;
	}

	//Getters and setters (2)
	public void setNumEggs(int numEggs){
			this.numEggs = numEggs;
		}

	public int getLeftOver(){
			return leftOver;
	}

	public int getNumBoxes(){
			return numBoxes;
	}

}//class