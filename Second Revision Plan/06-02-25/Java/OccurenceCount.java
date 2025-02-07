import java.util.*;
public class OccurenceCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,10,20,30,40,50,60,20,30};
        int key = sc.nextInt();
        int count = 0;
        for(int e:arr){
            if(e==key){
                count++;
            }
        }

        System.out.printf("Key: %d, Occurence:%d",key,count);
    }
}