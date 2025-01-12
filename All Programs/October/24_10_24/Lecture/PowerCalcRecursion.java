package Lecture;

public class PowerCalcRecursion {
    static int power=1;
    public static void main(String[] args) {
        int base=2,index = 4;
        getPower(base,index);
    }

    public static void getPower(int base, int index) {
        
        if(index>0){
            power = power*base;
            getPower(base, index-1);
        }else{

            System.out.println(base+" final power is "+power);
        }
    }
}
