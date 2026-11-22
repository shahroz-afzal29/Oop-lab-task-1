class Account {

    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {

    double interestRate;

    SavingsAccount(String name, double balance, double rate) {
        super(name, balance);
        interestRate = rate;
    }

    @Override
    void displayInfo() {
        System.out.println("Savings Account");
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {

    double overdraftLimit;

    CurrentAccount(String name, double balance, double limit) {
        super(name, balance);
        overdraftLimit = limit;
    }

    @Override
    void displayInfo() {
        System.out.println("Current Account");
        super.displayInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount s1 =
            new SavingsAccount("Ali", 50000, 5);

        CurrentAccount c1 =
            new CurrentAccount("Ahmed", 80000, 20000);

        s1.displayInfo();

        System.out.println();

        c1.displayInfo();
    }
}
