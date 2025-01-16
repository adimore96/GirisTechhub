/*
WAP to create class name as ConvertDecimalToBinary 
ConvertDecimalToBinary(int): this constructor is used for accept integer as parameter 
Vodi showBinary(): this function can convert decimal number to binary and display it.
*/

class ConvertDecimalToBinary{
	int decimal;
	ConvertDecimalToBinary(int decimal){
		this.decimal = decimal;
	}
	
	void showBinary(){
		int temp = decimal;
		
		StringBuilder binary = new StringBuilder();
		while(decimal>0){
			int mod = decimal%2;
			decimal /= 2;
			binary.append(mod);
		}
		binary.reverse();
		String binary1 = binary.toString();
		int binary2 = Integer.parseInt(binary1);
		
		System.out.println(binary2);
	}
	
	public static void main(String args[]){
		ConvertDecimalToBinary cdb = new ConvertDecimalToBinary(16);
		cdb.showBinary();
	}
}