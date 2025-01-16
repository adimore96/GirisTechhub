/*
Q2. WAP to create class Palim with parameterized constructor 
   Palim(int): this constructor can accept number as parameter 
   Boolean isPalim(): this method can check number is palimdrome or not if palimdrome return true otherwise return false

*/

public class Palim{
	int num;
	Palim(int num){
		this.num = num;
	}
	
	public Boolean isPalim(){
		int temp = num;
		
		int rev=0, rem;
		while(num>0){
			rem = num%10;
			rev = (rev*10) + rem;
			num /= 10;
		}
		
		if(rev == temp){
			return true;
		}
		return false;
	}

	//Main method
	public static void main(String args[]){
		Palim p = new Palim(51215);
		System.out.println("Check Num is Palim: "+p.isPalim());
	}
}