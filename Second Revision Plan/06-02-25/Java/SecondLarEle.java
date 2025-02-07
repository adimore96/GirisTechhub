public class SecondLarEle{
    public static void main(String args[]){
        int arr[] = {1,2,5,4,3,50,90,30,60};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && largest!=arr[i]){
                secondLargest = arr[i];
            }
        }

        System.out.printf("Largest Ele:%d Smallest Ele:%d",largest,secondLargest);
    }
}