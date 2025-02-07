import java.util.*;
public class FirstOccrIndex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,50,40,30,80,40,70,90};
        int ele = sc.nextInt();
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                index = i;
                break;
            }
        }

        if(index!=-1){
            System.out.printf("Ele:%d, Index:%d",ele,index);
        }else{
            System.out.printf("%d not found!",ele);
        }
    }
}