class Account {
    private double balance;

    Account() {
        this.balance = 0;
    }

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account(2000); // Initial balance 1000
        acc.deposit(1000);
        acc.withdraw(500);
        acc.displayBalance();
    }
}