public class RevArr{
    public static void main(String []args){
        int arr[] = {10,2,5,4,6,7,3,1};

        display(arr);
        for(int i=0, j=arr.length-1; i<arr.length/2; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        display(arr);
    }

    public static void display(int arr[]){
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
        System.out.println();
    }
}