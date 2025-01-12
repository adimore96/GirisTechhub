class BitwiseOperations {
    public static void main(String args[]) 
    {    
         int a = 1;
         int b = 2;
         int c = 3;
		 // 0001
		 // 0100
		 //------
		 // 0101 => 5
         a |= 4;  //a=5
		 
		 // 10 => 01 =>1
         b >>= 1;  // b=1
         c <<= 1;  // 011 => 110 => 6
		 
		 // 101
		 // 110
		 //-----
		 // 011 => 3
         a ^= c; //a = 3   
         System.out.println(a + " " + b + " " + c); // 3  1  6
    } 
}