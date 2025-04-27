/*
31. Sum of Cubes of First N Natural Numbers
Description: Write a program to calculate the sum of cubes of the first n natural numbers.
Input: n = 3
Output: 36
*/

public class SumOfCubes{
    public static int getCube(int num, int power){
        // return num*num*num;

        // another logic to get cube
        int totPow = 1;
        for(int i=1; i<=power; i++){
            totPow *= num;
        }
        return totPow;
    }
    
    public static void main(String args[]){
        int num = 3, sum=0;
        for(int i=1; i<=num; i++){
            sum += getCube(i,3);
        }
        System.out.println(sum);
    }
}