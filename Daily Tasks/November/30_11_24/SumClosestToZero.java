/*
Write a program in C to find two elements whose sum is closest to zero
Expected Output :
 The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
 The Pair of elements whose sum is minimum are:
 [44, -46]
 */
public class SumClosestToZero {
    public static void main(String[] args) {
        int arr[] = {38,44,63,-51,-35,19,84,-69,4,-46};

        int closestSum = Integer.MAX_VALUE;
        int element1=0,element2=0;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j<arr.length; j++){
                int sum = Math.abs(arr[i])-Math.abs(arr[j]);
                System.out.println("Sum: "+sum);
                if((int)Math.abs(sum)<closestSum){
                    closestSum = (int)Math.abs(sum);
                    element1 = arr[i];
                    element2 = arr[j];
                }
            }
        }

        System.out.printf("The Pair of elements whose sum is minimum are: [%d, %d]",element1,element2);

    }
}
