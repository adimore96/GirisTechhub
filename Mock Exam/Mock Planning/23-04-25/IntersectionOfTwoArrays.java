/*
2. Find the Intersection of Two Arrays
Description: Write a program to find the common elements in two arrays.

Input: [1, 2, 2, 1], [2, 2]
Output: [2, 2]
*/

import java.util.*;

public class IntersectionOfTwoArrays{
    public static void main(String args[]){
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = {2, 2};

        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int ele:arr1){
            hm.put(ele, hm.getOrDefault(ele,0)+1);
        }

        for(int ele:arr2){
            if(hm.containsKey(ele) && hm.get(ele)>0){
                al.add(ele);
                hm.put(ele, hm.get(ele)-1);
            }
        }

        System.out.println(al);

    }
}