public class PalindromeRecursion {
    
    static int  rev=0;

    public static int isPalindrome(int num){
        if(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
            isPalindrome(num);
        }
        return rev;
    }
    public static void main(String[] args) {
        int num=123211;
        int temp = num;
        int isPalindrome = isPalindrome(num);
        if(isPalindrome==temp){
            System.out.println(temp+" is Palindrome");
        }else{
            System.out.println(temp+" is not a Palindrome");
        }
    }
}