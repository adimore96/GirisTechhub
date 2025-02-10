public class MergeSortedArray{
    private int []arr1;
    private int []arr2;
    private int []arr3;

    public void setArray(int arr1[], int arr2[]){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public void merge(){
        int size = arr1.length + arr2.length;
        int arr3[] = new int[size];
        int i=0;
        for(; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int j=0; j<arr2.length; j++,i++){
            arr3[i] = arr2[j];
        }

        this.arr3 = arr3;
    }

    public int[] getMergedArray(){
        return arr3;
    }

    public static void main(String args[]){
        int arr1[] = {10,20,30,40};
        int arr2[] = {50,60,70,80};
        MergeSortedArray ms = new MergeSortedArray();
        ms.setArray(arr1,arr2);
        ms.merge();
        int arr3[] = ms.getMergedArray();

        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+"  ");
        }
    }
}