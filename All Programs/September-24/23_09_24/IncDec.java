class IncDec
{  public static void main(String s[])
    {   
		 int a = 1;
         int b = 2;
         int c;
         int d;

        c = ++b; //2  b will be 3
        d = a++; //1  a will be 2
        c++;     // c will be 4
        System.out.println ("a = " + a); //2
        System.out.println ("b = " + b); //3
        System.out.println ("c = " + c); //4
        System.out.println ("d = " + d); //1
    }
}
