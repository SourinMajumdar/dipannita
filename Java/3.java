import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class SalaryException extends Exception {
    public SalaryException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter the salary of employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();

            try {
                if (salary > 30000) {
                    throw new SalaryException("Salary is greater than Rs. 30000");
                }
                employees[i] = new Employee(name, salary);
            } catch (SalaryException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nEmployee Information");
        System.out.println("--------------------");
        for (int i = 0; i < n; i++) {
            if (employees[i] != null) {
                System.out.println("Name: " + employees[i].getName());
                System.out.println("Salary: " + employees[i].getSalary());
                System.out.println();
            }
        }
    }
}