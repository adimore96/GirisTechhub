public class SumOfEle{
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60};

        int sum = 0;
        for(int e:arr){
            sum += e;
        }

        System.out.printf("Sum: %d",sum);
    }
}