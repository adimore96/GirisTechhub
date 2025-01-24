class Employee {
    private int id;
    private String name;
    private int totalWorkingHours;
    private int salary;
    private int overtimePay;

    // Constructor to set employee information
    public Employee(int id, String name, int totalWorkingHours) {
        this.id = id;
        this.name = name;
        this.totalWorkingHours = totalWorkingHours;
        this.salary = 0;
        this.overtimePay = 0;
    }

    // Getters
    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    // Method to set salary and overtime pay
    public void setSalaryAndOvertime(int salary, int overtimePay) {
        this.salary = salary;
        this.overtimePay = overtimePay;
    }

    // Method to display employee information
    public void displayInformation() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Overtime Pay: Rs. " + overtimePay);
        System.out.println("Total Salary: Rs. " + salary);
        System.out.println("--------------------------------");
    }
}

class OverTime {
    private Employee[] employees;

    // Method to set employees
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    // Method to calculate overtime and salary
    public void calculateOvertime() {
        final int HOURLY_RATE = 50; // Rs.50 per hour for overtime
        final int MAX_SHIFT_HOURS = 8; // Maximum daily shift hours
        final int MAX_WEEKLY_HOURS = 40; // Maximum weekly hours without overtime

        for (Employee emp : employees) {
            int totalHours = emp.getTotalWorkingHours();
            int overtimeHours = 0;

            // Calculate overtime hours if total working hours exceed allowed weekly hours
            if (totalHours > MAX_WEEKLY_HOURS) {
                overtimeHours = totalHours - MAX_WEEKLY_HOURS;
                totalHours = MAX_WEEKLY_HOURS; // Adjust total hours to the max allowed
            }

            // Calculate salary and overtime pay
            int salary = totalHours * MAX_SHIFT_HOURS;
            int overtimePay = overtimeHours * HOURLY_RATE;

            // Set salary and overtime pay
            emp.setSalaryAndOvertime(salary, overtimePay);
        }
    }
}

public class OverTimeCalculator {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Setting employee information
        employees[0] = new Employee(1, "Alice", 45);
        employees[1] = new Employee(2, "Bob", 38);
        employees[2] = new Employee(3, "Charlie", 50);
        employees[3] = new Employee(4, "David", 40);
        employees[4] = new Employee(5, "Eve", 42);

        // Create OverTime object
        OverTime overTime = new OverTime();
        overTime.setEmployees(employees);

        // Calculate overtime and salaries
        overTime.calculateOvertime();

        // Display employee information
        System.out.println("Employee Overtime and Salary Details:");
        System.out.println("--------------------------------------");
        for (Employee emp : employees) {
            emp.displayInformation();
        }
    }
}
