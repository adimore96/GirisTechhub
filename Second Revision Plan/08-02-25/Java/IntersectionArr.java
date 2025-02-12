public class IntersectionArr{
    public static void main(String args[]){
        int arr1[] = {1,2,2,1};
        int arr2[] = {2,1,2};

        

        boolean isVisited[] = new boolean[arr2.length];
        for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr2.length; j++){
                    if(!isVisited[j]){
                    if(arr1[i]==arr2[j]){
                        isVisited[j] = true;
                        System.out.print(arr2[i]+"  ");
                    }
                }
            }
        }
    }
}