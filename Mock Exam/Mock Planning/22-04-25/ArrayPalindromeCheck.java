/*
11. Check if Array is Palindrome
Description: Check if an array is the same when reversed.
Input: [1, 2, 3, 2, 1]
Output: Palindrome
*/

public class ArrayPalindromeCheck{
    public static void main(String args[]){
        int arr[] = {1,2,3,2,1};

        boolean isPalindrome = true;

        for(int i=0, j=arr.length-1; i<(arr.length)/2; i++,j--){
            if(arr[i]!=arr[j]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not Palindrome");
        }
    }
}