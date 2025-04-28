/*
49. Perfect Square Numbers
Description: Write a program to find perfect square numbers up to n.
Input: n = 20
Output: 1 4 9 16
*/

public class PerfectSquareNumbers{
    public static void main(String args[]){
        int num = 20;
        int i=1;
        while(true){
            if(i*i>=20){
                break;
            }else{
                System.out.print((i*i)+" ");
                i++;
            }
        }
    }
}
