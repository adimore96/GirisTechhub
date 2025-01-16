/*
WAP to create class name as Power with Parameterized constructor 

  Power(int,int): create constructor and accept two parameters in it.
  Int getPower(): this function can calculate power of a number and return it.
*/

public class Power{
	private int pow=1;
	Power(int num, int ind){
		while(ind>0){
			pow *= num;
			ind--;
		}
	}
	
	//get Power
	public int getPower(){
		return pow;
	}
	
	//Main method
	public static void main(String args[]){
		Power p = new Power(2,4);
		System.out.println("Power: "+p.getPower());
	}
}
