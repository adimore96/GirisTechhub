/*

5.    Find Duplicates in an Array
   Write a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.

*/


class FindDuplicEle{
	
	
	void getDuplicates(int ...arr){
		boolean visited[] = new boolean[arr.length];
		
		for(int i=0; i<arr.length-1;i++){
			if(!visited[i]){
				
				int counter=1;
				for(int j=i+1; j<arr.length; j++){
					if(arr[i]==arr[j]){
						visited[j] = true;
						counter++;
					}
				}
				if(counter>1)
					System.out.printf("Duplicate element is %d occurs %d times.\n",arr[i],counter);
			}
		} 
		
	}
}

public class DuplicateEleFindVA{
	public static void main(String args[]){
		FindDuplicEle fd = new FindDuplicEle();
		fd.getDuplicates(10,20,20,30,45,10,9,8,6,7,3,5,8,7,4,6,10);
	}
}