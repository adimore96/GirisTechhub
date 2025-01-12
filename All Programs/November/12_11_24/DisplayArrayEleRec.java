public class DisplayArrayEleRec {

    public static void displayArrayElements(int arr[], int index){
        if(index >= arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        displayArrayElements(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,52,45,32,11,23,21};

        displayArrayElements(arr,0);
    }
}
