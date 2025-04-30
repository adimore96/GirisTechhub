/*
9. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.
Input: [1, 2, 3, 4], [3, 4, 5, 6]
Output: [3, 4]
*/
import java.util.*;
public class CommonEleInTwoArrays{
    public static void main(String args[]){
        Integer arr1[] = {1,2,3,4};
        Integer arr2[] = {3,4,5,6};

        // By manually Core Java
        System.out.print("[");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
        System.out.print("]");


        // by using collections

        // First Approach by using method: ratainAll()
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.retainAll(set2);
        System.out.println(set1);

        // Second Approach by manual method

        List<Integer> commonElements = findCommonElements(arr1,arr2);
        System.out.println(commonElements);
    }

    public static List findCommonElements(Integer arr1[], Integer arr2[]){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        List<Integer> result = new ArrayList<>();
        for(int ele:arr2){
            if(set1.contains(ele)){
                result.add(ele);
                set1.remove(ele);
            }
        }
        return result;
    }
}