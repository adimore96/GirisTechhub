package Lecture;

public class FactRecursion {
    public static int fact=1;
    public static void main(String[] args) {
        int num = 5;
        int result = getFact(num);
        System.out.println(num+" factorial is: "+result);
    }

    public static int getFact(int num){
        if(num>0){
            fact = fact*num;
            getFact(num-1);
        }

        return fact;
    }
}
