public class DuplicateEle{
    public static void main(String args[]){
        int arr[] = {10,20,10,20,30,40,50,30};
        boolean visited[] = new boolean[arr.length];

        for(int i=0 ; i<arr.length; i++){
            if(visited[i]==false){
            for(int j=i; j<arr.length; j++){ 
                    if(arr[i]==arr[j]&&i!=j){
                        visited[j] = true;         
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}