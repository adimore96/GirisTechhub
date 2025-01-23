/*
Q4. Write a java program to create class name as UnionApp using contsructor overloading name as :

	UnionApp(int [ ])
	{
		//  Check array is Majority or Not.
	}
	
	UnionApp(int a[ ] , int b[ ])
	{
		//   find Union array of two array.
	}
*/

public class UnionApp{
    UnionApp(int[] arr){
        boolean isMajority = false;
        for(int i=0; i<arr.length; i++){
            int majorityEle=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    majorityEle++;
                }
            }
            if(majorityEle>=(arr.length)/2){
                isMajority = true;
            }
        }

        if(isMajority){
            System.out.println("Array is in Majority.");
        }else{
            System.out.println("Array is not in Majority.");
        }
    }

    //Array Union Constructor
    UnionApp(int[]arr1, int[] arr2){
        int[] temp = new int[arr1.length + arr2.length];
        int size=0;
        for(int e:arr1){
            if(!contains(temp,size,e)){
                temp[size++] = e;
            }
        }

        for(int e:arr2){
            if(!contains(temp,size,e)){
                temp[size++] = e;
            }
        }

        //creating union array
        int[] unionArray = new int[size];
        for(int i=0; i<size; i++){
            unionArray[i] = temp[i];
        }

        //Displaying Union array
        for(int e:unionArray){
            System.out.print(e+"\t");
        }
    }

    //Check element present in array or not
    private boolean contains(int[] arr, int size, int ele){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                return true;
            }
        }
        return false;
    }

    // main method
    public static void main(String args[]){
        int arr[] = {1,21,4,1,2,3,1,1};
        UnionApp ua = new UnionApp(arr);

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        ua = new UnionApp(arr1,arr2);
    }
}