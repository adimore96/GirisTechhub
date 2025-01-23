/*
Q2. Write a java program to create class name as OccurenceApp using contsructor name as :

	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	}
*/

public class OccurenceApp{
    OccurenceApp(int arr[]){
        int even=0, odd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.printf("Even: %d, Odd: %d\n",even,odd);
    }

    OccurenceApp(char cha[]){
        int vowel=0, consonent=0;
        for(char ch:cha){
            if(ch=='a' || ch=='A' || ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                vowel++;
            }else{
                consonent++;
            }
        }
        System.out.printf("Vowels: %d, Consonent: %d\n",vowel,consonent);
    }


    public static void main(String args[]){
        int arr[] = {11,2,3,4,5,6,7};
        OccurenceApp oa = new OccurenceApp(arr);
        char ch[] = {'a','z','b','i'};
        OccurenceApp o = new OccurenceApp(ch);

    }
}