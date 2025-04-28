/*
46. Print Decreasing Number Pattern
Description: Write a program to print a decreasing number pattern.
Input: n = 5


Output:
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
public class DecreasingNumPattern{
    public static void main(String args[]){
        int num = 5;

        for(int i=num; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}