/*
WAP to create class name as ConvertDecimalToRoman 
ConvertDecimalToRoman(int decimal): this constructor can accept decimal number 
Void showRoman(): this function can convert a decimal number to roman and display it.
*/

public class ConvertDecimalToRoman{
	int decimal;
	
	ConvertDecimalToRoman(int decimal){
		this.decimal = decimal;
	}
	
	void showRoman(){
		
		if(decimal<=0 || decimal > 3999){
			System.out.println("Invalid Number! Please enter a number between 1 to 3999.");
			return;
		}
		
		int number = decimal;
		int[] values =  {1000, 900, 500, 400,  100, 90,  50, 40,  10,  9,  5,   4,  1};
		String[] romans ={"M", "CM","D", "CD", "C", "XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder roman = new StringBuilder();
		for(int i=0; i<values.length; i++){
			while(number>=values[i]){
				roman.append(romans[i]);
				number -= values[i];
			}
		}
		
		System.out.println("The Roman Number of "+decimal+" is: "+roman);
	}
	
	
	public static void main(String args[]){
		ConvertDecimalToRoman cdr = new ConvertDecimalToRoman(49);
		cdr.showRoman();
	}
}