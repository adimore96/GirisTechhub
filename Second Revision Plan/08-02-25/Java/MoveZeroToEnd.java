public class MoveZeroToEnd{
    public static void main(String args[]){
        int arr[] = {0,1,9,0,5,3,0,7};
        int index = 0;
        int size = arr.length;

        //display
        for(int e:arr){
            System.out.print(e+"  ");
        }
        System.out.println();

        //shifting the non-zeros to start
        for(int i=0,j=arr.length-1; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }

        // assign 0 to rem
        while(index<size){
            arr[index++] = 0;
        }

        // displaying
        for(int e:arr){
            System.out.print(e+"  ");
        }
        System.out.println();
    }
}