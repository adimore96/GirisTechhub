/* 
Q7. Write a java program to merge two array and display it.
*/
public class MergeArray {

    public static void main(String[] args) {
        
        int arr1[] = {10,20,30,40,50};
        int arr2[] = {60,70,80,90,100,200};

        int size =  arr1.length + arr2.length;

        int arr3[] = new int[size];

        for(int i=0,j=0; i<size; i++){
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[j];
                j++;
            }
        }

        // Displaying merged array
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
    
}
