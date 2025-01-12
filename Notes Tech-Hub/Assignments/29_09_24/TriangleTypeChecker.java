// check whether a triangle is equilateral, scalene or isosceles triangle

import java.util.*;
public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Side: ");
        int fs = sc.nextInt();
        System.out.print("Enter Second Side: ");
        int ss = sc.nextInt();
        System.out.print("Enter Third Side: ");
        int ts = sc.nextInt();

        if(fs==ss && ss==ts && fs==ts){
            System.out.println("Triangle is Equiletral");
        }
        else if(fs==ss || ss==ts || fs==ts){
            System.out.println("Triangle is Isosceles");
        }
        else{
            System.out.println("Triangle is Scalen");
        }
        
    }
}
