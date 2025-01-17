/*
4. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/

class Employee{
    private int salary;
    Employee(int salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee's work....!");
    }

    public int getSalary(){
        return salary;
    }
}

class HRManager extends Employee{
    HRManager(int salary){
        super(salary);
    }

    public void work(){
        System.out.println("HR's work...!");
    }

    public void addEmployee(String employee){
        System.out.println("Employee added: "+employee);
    }
}

public class HRApp{
    public static void main(String args[]){
        HRManager hrm = new HRManager(9000);
        hrm.work();
        hrm.addEmployee("Aditya");
        System.out.println("Salary: "+hrm.getSalary());
    }
}