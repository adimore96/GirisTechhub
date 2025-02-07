public class CheckArraySorted{
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int arr1[] = {50,40,30,20,10};
        int arr2[] = {10,9,11,20,30};

        checkSorted(arr);
    }

    public static void checkSorted(int arr[]){
        boolean ascending = isAscSorted(arr);
        boolean descending = isDescSorted(arr);

        if(ascending){
            System.out.println("Array is Sorted in Ascending Order");
        } else if(descending){
            System.out.println("Array is Sorted in Descending Order");
        }else{
            System.out.println("Array is Unordered!");
        }
    }

    public static boolean isAscSorted(int arr[]){
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static boolean isDescSorted(int arr[]){
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

}