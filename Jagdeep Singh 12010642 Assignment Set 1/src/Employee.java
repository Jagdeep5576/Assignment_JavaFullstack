import java.util.Scanner;
public class Employee {
    //declaring the variables
    String name;
    int age;
    double salary;
    //creating two constructors
    public Employee() {
        name = "James";
        age = 25;
        salary = 150000;
    }
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //creating a method to calculate PF and allowances
    public double calculatePFAndAllowances() {
        double pf = salary * 0.12;
        double allowances = salary * 0.2;
        return pf + allowances;
    }
    //creating a main method
    public static void main(String[] args) {
        //creating an object of Employee class
        Employee employee = new Employee();
        //printing the employee object's values
        System.out.println("Employee name: " + employee.name);
        System.out.println("Employee age: " + employee.age);
        System.out.println("Employee salary: " + employee.salary);
        //calling the calculatePFAndAllowances method
        double pfAndAllowances = employee.calculatePFAndAllowances();
        //printing the PF and allowances
        System.out.println("PF and allowances: " + pfAndAllowances);
    }
}
