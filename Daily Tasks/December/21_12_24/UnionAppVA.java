/*
Q3. Write a java program to create class name as UnionApp using function name as :

	void arrayOpe(int ...a)
	{
		//  Check array is Majority or Not.
	}
*/

class UnionApp{
	void isArrayMajority(int ...arr){
		boolean visited[] = new boolean[arr.length];
		System.out.print("Majority Elements: ");
		for(int i=0; i<arr.length; i++){
			int counter = 0;
			if(!visited[i]){
				for(int j=0; j<arr.length; j++){
						if(arr[i]==arr[j]){
							visited[j] = true;
							counter++;
						}
				}
			}
			
			if(counter>=(arr.length/2)){
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}
}
public class UnionAppVA{
	public static void main(String args[]){
		UnionApp ua = new UnionApp();
		ua.isArrayMajority(1,2,1,1,1,1,1,2,2,2,2,2);
	}
}