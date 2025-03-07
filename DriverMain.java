import java.util.Scanner;

// Interface Taxable
interface Taxable {
    double salesTax = 0.07; // 7%
    double incomeTax = 0.105; // 10.5%

    double calcTax(); // Abstract method to calculate tax
}

// Employee class implementing Taxable
class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implement calcTax method to calculate income tax
    public double calcTax() {
        return salary * incomeTax; // Income tax on yearly salary
    }
}

// Product class implementing Taxable
class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implement calcTax method to calculate sales tax on unit price
    public double calcTax() {
        return price * salesTax; // Sales tax on unit price
    }
}

// Main class to accept input and print tax details
public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Employee details
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empId, name, salary);
        System.out.println("Income Tax for " + emp.name + ": $" + emp.calcTax());

        // Input Product details
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Product Quantity: ");
        int quantity = sc.nextInt();

        Product prod = new Product(pid, price, quantity);
        System.out.println("Sales Tax on unit price: $" + prod.calcTax());

        sc.close();
    }
}