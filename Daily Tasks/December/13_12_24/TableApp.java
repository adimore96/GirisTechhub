import java.util.Scanner;

class Table {
    private int number; // Instance variable to store the number

    // Function to accept number from keyboard
    void setValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its table: ");
        number = sc.nextInt();
    }

    // Function to display the table of the number
    void showTable() {
        System.out.println("Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class TableApp {
    public static void main(String[] args) {
        Table table = new Table(); // Creating an object of the Table class
        table.setValue();         // Accepting the number from the user
        table.showTable();        // Displaying the table of the entered number
    }
}
