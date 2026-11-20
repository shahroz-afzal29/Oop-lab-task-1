
import java.util.Scanner;

class Employee {

    static Scanner sc = new Scanner(System.in);

    int id;
    double salary;

    void input() {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        salary = sc.nextDouble();
    }

    double calculateSalary() {
        return salary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + salary);
    }
}

class PermanentEmployee extends Employee {

    double calculateSalary() {
        return salary + (salary * 0.20);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Permanent Employee Salary: " + calculateSalary());
    }
}

class ContractEmployee extends Employee {

    double calculateSalary() {
        return salary + (salary * 0.10);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Contract Employee Salary: " + calculateSalary());
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        PermanentEmployee p1 = new PermanentEmployee();

        System.out.println("=== Permanent Employee ===");
        p1.input();
        p1.display();

        System.out.println();

        ContractEmployee c1 = new ContractEmployee();

        System.out.println("=== Contract Employee ===");
        c1.input();
        c1.display();
    }
}
