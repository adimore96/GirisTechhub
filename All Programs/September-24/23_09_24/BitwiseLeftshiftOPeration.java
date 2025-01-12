class BitwiseLeftshiftOPeration {
    public static void main(String args[]) 
    {        
         byte x = 64;
         int i;
         byte y;
//		0 1 1 1 1 1 1 1 
//    1 1 1 1 1 1 1 0 0
//-------------------------
//    380
         i = x << 2;
         y = (byte) (x << 2);
         System.out.print(i + "\t" + y);
    }
}	
