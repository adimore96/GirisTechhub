/*
Write a program in C to find the smallest missing element from a sorted array?
Expected Output :
 The given array is : 0 1 3 4 5 6 7 9
 The missing smallest element is: 2
 */
public class SmallestMissingEleArr {
    public static void main(String[] args) {
        int arr[] = {0,1,3,4,5,6,7,9};

        for (int i = 0; i < arr.length; i++) {
            if((arr[i+1]-arr[i])>1){
                System.out.printf("The missing smallest element is: %d", arr[i]+1);
                break;
            }
        }
    }
}
