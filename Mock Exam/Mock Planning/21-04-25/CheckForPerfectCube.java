/*
54. Check for Perfect Cube
Description: Write a program to check if a number is a perfect cube.
Input: n = 27
Output: Perfect Cube
*/

public class CheckForPerfectCube{
    public static void main(String args[]){
        int num = 27;
        boolean isCube = false;

        for(int i=1; i*i*i<=num; i++){
            if(i*i*i == num){
                isCube = true;
                break;
            }
        }

        if(isCube){
            System.out.println(num+" is a Perfect Cube");
        }else{
            System.out.println(num+" is not a Perfect Cube");
        }
        
    }
}