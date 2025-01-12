/* 
Q8. Write a java program to find prime number in array.
 */
public class PrimeNumFindInArray {
    
    public static void main(String[] args) {

        int arr[] = {5,7,10,15,30,17,24,27,30,47};

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;
             for(int j=2; j<num/2; j++){
                if(num%j==0){
                    isPrime = false;
                    break;
                }
             }
             if(isPrime){
                 System.out.println("Prime num: "+num);
             }
        }
        
    }
}
