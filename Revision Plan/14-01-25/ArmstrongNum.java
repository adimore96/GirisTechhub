public class ArmstrongNum{
    
    static void isArmstrong(int num){
        int temp = num;
        int pow = 0;
        //getting power
        while(num>0){
            pow++;
            num /= 10;
        }
        num = temp;
        int armNum = 0;
        while(num>0){
            int rem = num % 10;
            int rem1 = 1;
            for(int i=0; i<pow; i++){
                rem1 = rem1*rem;
            }
            armNum += rem1;
            num /= 10;
        }
        if(armNum == temp){
            System.out.println(temp+" is a Armstrong Number!");
        }else{
            System.out.println(temp+" is not a Armstrong Number!");
        }
        
    }
    
    public static void main(String args[]){
        int num = 1634;
        isArmstrong(num);
    }
}