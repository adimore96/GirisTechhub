public class RotateEleKTimes{
    private int arr[];

    public void setArray(int arr[]){
        this.arr = arr;
    }

    public void rotate(int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    public void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public int[] getResult(){
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int k=1;

        display(arr);

        RotateEleKTimes re = new RotateEleKTimes();
        re.setArray(arr);
        re.rotate(k);
        int arr1[] = re.getResult();
        display(arr1);
        
    }

    public static void display(int arr[]){
        for(int e:arr){
            System.out.print(e+"   ");
        }
        System.out.println();
    }
}