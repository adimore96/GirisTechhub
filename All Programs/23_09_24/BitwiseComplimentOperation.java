class BitwiseComplimentOperation{
    public static void main(String args[])
    {
        int var1 = 42;
		                                //             32168421  
                          //00000000 00000000 00000000 00101010  (This is 42 in decimal)
//Flip Bit makes irNegative 11111111 11111111 11111111 11010101   
	        //-------------------------------------------------
	         //Original:    11111111 11111111 11111111 11010101
            //Invert:       00000000 00000000 00000000 00101010
            //                 +                              1
            //--------------------------------------------------
            //              00000000 00000000 00000000 00101011  (This is 43 in decimal)
            //Since we originally determined that the number was negative due to the sign bit being 1, we negate the result. Thus, 11111111 11111111 11111111 11010101 is -43 in decimal.
        int var2 = ~var1;
        System.out.print(var1 + " " + var2);      
    } 
}
