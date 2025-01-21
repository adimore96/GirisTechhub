/*
Q1. Write a java program to create class name ReverseApp using contsructor name as :

	ReverseApp(int [ ])
	{
		//  perform integer reverse array logic.
	}
	
	ReverseApp(String )
	{
		//  perform string reverse logic.
	}
*/

public class ReverseApp{
    private int arr[];

    ReverseApp(int arr[]){
        for(int i=0,j=arr.length-1; i<(arr.length)/2; i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        this.arr = arr;
    }

    //Display method for int array
    public void display(){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    ReverseApp(String str){
        String str1 = "";
        for(int i=0; i<str.length(); i++){
            str1 = str.charAt(i) + str1;
        }

        System.out.println(str1);
    }


    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60};
        ReverseApp ra = new ReverseApp(arr);
        ra.display();
        
        ra = new ReverseApp("Aditya");
    }
}