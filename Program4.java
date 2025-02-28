import java.util.Scanner;

// Person class
class Person {
    String name;
    int age;

    Person() {
        this.name = "Unknown";
        this.age = 18;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Employee class inheriting Person
class Employee extends Person {
    int employeeID;
    double salary;

    // Constructor using super to initialize Person attributes
    Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    void displayEmployee() {
        display();
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }
}

// Account class
class Account1 {
    double balance;

    // Default constructor
    Account1() {
        this.balance = 0;
    }

    // Parameterized constructor
    Account1(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Display balance method
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Main class (Renamed to avoid duplicate issue)
class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Person objects
        Person p1 = new Person();
        Person p2 = new Person("Alice", 25);

        // Displaying Person details
        p1.display();
        p2.display();

        // Creating Employee object
        Employee emp = new Employee("Bob", 30, 101, 50000);
        emp.displayEmployee();

        // Creating Account object (Fixed Account1 class reference)
        Account1 acc = new Account1(3000);
        acc.displayBalance();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.displayBalance();

        sc.close();
    }
}
