public class EvenOddCount{
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int even=0,odd=0;
        for(int e:arr){
            if(e%2==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.printf("Even:%d Odd:%d",even,odd);
    }
}