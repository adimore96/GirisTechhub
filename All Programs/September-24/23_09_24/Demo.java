public class Demo
{
    public static void main(String[] args)
    {  int i, j, k, l = 0;
        k = l++; //0 and l is 1
        j = ++k; // 1 and k is 2
        i = j++; // 1 and j is 2
        System.out.println("I is  "+i);
    }
}
