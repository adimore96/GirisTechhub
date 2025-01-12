public class SumNaturalNumRec {
    static int sum = 0;
    public static int sumNumRec(int n){
        if(n<=0){
            return -1;
        }
        sum = sum+n;
        sumNumRec(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNumRec(n));
        System.out.println(sum);
    }
}
