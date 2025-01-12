package Lecture;

public class TableRecursion {
    static int counter = 1;
    public static void main(String[] args) {
        int num = 5;
        getTable(num);
    }

    public static void getTable(int num){
        
        if(counter<=10){
            System.out.printf("%d * %d = %d\n",counter,num,counter*num);
            counter++;
            getTable(num);
        }
        else{
            System.out.println("Thank you!");
        }
    }
}
