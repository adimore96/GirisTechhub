/*
10. Merge Two Arrays
Description: Merge two arrays into one.
Input: [1, 2, 3], [4, 5, 6]
Output: [1, 2, 3, 4, 5, 6]
*/
import java.util.*;
public class MergeArrays{
    public static void main(String args[]){
        Integer arr1[] = {1,2,3};
        Integer arr2[] = {4,5,6};

        Integer result [] = getMergedArray(arr1,arr2);
        for(int ele:result){
            System.out.print(ele+" ");
        }
        System.out.println();

        // Now by using collections
        ArrayList al = getNewArray(arr1,arr2);
        System.out.println(al);
    }

    public static Integer[] getMergedArray(Integer arr1[], Integer arr2[]){
        Integer result[] = new Integer[arr1.length+arr2.length];
        int i=0;
        for(; i<arr1.length; i++){
            result[i] = arr1[i];
        }
        for(int j=0 ; j<arr2.length;j++, i++){
            result[i] = arr2[j];
        }
        return result;
    }

    public static ArrayList getNewArray(Integer arr1[], Integer arr2[]){
        ArrayList al = new ArrayList();
        for(int ele:arr1){
            al.add(ele);
        }
        for(int ele:arr2){
            al.add(ele);
        }

        return al;
    }
}