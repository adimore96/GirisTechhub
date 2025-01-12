/**
 * FloydsTriangle
 */
public class FloydsTriangle {

    public static void main(String[] args) {
        int counter = 1, n=5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(counter>9)
                System.out.print(counter+" ");
                else
                System.out.print(counter+"  ");
                counter++;
            }
            System.out.println();
        }
    }
}