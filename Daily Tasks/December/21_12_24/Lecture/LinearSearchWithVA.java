 class LinearSearch{
    int arr[];
    
    	public void setValue(int ...X){
		arr = X;
	}
	public int getResult(int value){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==value){
				return value;
			}
		}
		return -1;		
	}
}


public class LinearSearchWithVA {
    public static void main(String[] args) {

	LinearSearch ls = new LinearSearch();
	ls.setValue(10,20,30,40,50,60);
	int result = ls.getResult(20);

	if(result != -1){
		System.out.printf("Element found : %d",result);
	}else{
		System.out.printf("Element not found! ");

	}
        
    }
}