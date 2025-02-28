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


    Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }


    void displayEmployee() {
        display();
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }
}

class Account1 {
    double balance;

    Account1() {
        this.balance = 0;
    }

    Account1(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person("Alice", 25);

        p1.display();
        p2.display();


        Employee emp = new Employee("Bob", 30, 101, 50000);
        emp.displayEmployee();

        
        Account1 acc = new Account1(3000);
        acc.displayBalance();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.displayBalance();

        sc.close();
    }
}
