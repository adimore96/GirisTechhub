import java.util.*;
public class ValidTriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Angle: ");
        int fa = sc.nextInt();
        System.out.print("Enter Second Angle: ");
        int sa = sc.nextInt();
        System.out.print("Enter Third Angle: ");
        int ta = sc.nextInt();

        if((fa+sa+ta)==180 && fa>0 &&sa>0 && ta>0){
            System.out.println("It is a valid Triangle");
        }else{
            System.out.println("It is not a Valid Triangle");
        }
        
    }
}
