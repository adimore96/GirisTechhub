class MyClass
{
    public static void main(String s[])
    {  
		int i = 4;
        int j = 21;
        int k = ++i * 7 + 2 - j--;
		//        5 * 7 + 2 - 21
		//		    35  + 2 - 21
		//				16
        System.out.println("k = " + k+"\t J="+j);
    }
}
