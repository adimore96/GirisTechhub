public class MinMaxEle {
    static int min=0, max=0;
    public static int minMaxEle(int arr[], int index){
        if(index>=arr.length){
            return -1;
        }
        if(index==0){
            min = arr[index];
        }
        if(min>arr[index]){
            min = arr[index];
        }
        if(max<arr[index]){
            max = arr[index];
        }
        minMaxEle(arr, index+1);
        return 1;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,20,30,700,45,90,1};
        minMaxEle(arr,0);
        System.out.println(min);
        System.out.println(max);
    }
}
