import java.util.*;

class Triangle{
    private int a,b,c;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }

    public double getArea(){
        double area = Math.sqrt( ((a+b+c)/2) * (((a+b+c)/2)-a) * (((a+b+c)/2)-b) * (((a+b+c)/2)-c)  );
        return area;
    }
}

public class AreaOfTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       // System.out.print("Enter no. of Triangle: ");
        int n = sc.nextInt();

        if(n<1 || n>100){
            System.out.println("Enter valid number (1-100)");
            return;
        }

        Triangle c[] = new Triangle[n];
        for(int i=0; i<c.length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ci = sc.nextInt();
            c[i] = new Triangle(a,b,ci);
        }

        //Sorting
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c.length; j++){
                if(c[i].getArea() < c[j].getArea()){
                    Triangle temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                }
            }
        }

        //displaying
        for(int i=0; i<c.length; i++){
            System.out.println(c[i].getA()+"    "+c[i].getB()+"     "+c[i].getC());
        }
    }
}