public class LargeAndSmallEle{
    public static void main(String args[]){
        int arr[] = {15,2,5,15,20,45,30,96,10,0};
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.printf("Max:%d  Min:%d",max,min);
    }
}