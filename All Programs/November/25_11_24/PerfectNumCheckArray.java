/*
Q9. Write a java program to find perfect number in array.
 */
public class PerfectNumCheckArray {
    public static void main(String[] args) {
        int arr[] = {4,6,7,145,28, 496,8128};

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            for(int j=1; j<=num/2; j++){
                if(num%j==0){
                    sum += j;
                }
            }
            if(sum==num){
                System.out.println(num+" is a Perfect Number.");
            }
        }
    }
}
