/*
Example:
Input:
Array 1: [1, 2, 2, 1]
Array 2: [2, 2]
Output: [2] (Note that even though 2 appears twice in both arrays, it should appear only once in the intersection).

Your Task: we want to create class name as  FindIntersection with following methods
  void setArrays(int a[ ] , int b [ ]): this function accept two array as input 
  void intersection(): this function can find the intersection of two array
int [] getIntersection(): this function can return resultant array at function calling point.

*/

public class IntersectionArr{
    int arr1[], arr2[];

    void setArrays(int arr1[], int arr2[]){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    void getIntersection(){
        boolean isVisited[] = new boolean[arr1.length];
        
        for(int i=0; i<arr2.length; i++){
            boolean isFound = false;
           
                for(int j=0; j<arr1.length; j++){
                     if(!isVisited[j]){
                    if(arr2[i]==arr1[j]){
                        isFound = true;
                        isVisited[j]=true;
                    }
                    // System.out.println(arr2);
                }
            }
            if(isFound){
                System.out.print(arr2[i]+"  ");
            }
        }
    }
    public static void main(String args[]){
        int arr1[] = {1,2,2,1,2,1};
        int arr2[] = {2,2,1,2,1};

        IntersectionArr ia = new IntersectionArr();
        ia.setArrays(arr1,arr2);
        ia.getIntersection();

        // boolean isVisited[] = new boolean[arr2.length];
       
    }
}