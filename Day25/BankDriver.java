
import java.util.Scanner;

interface Bank {
    double getBalance();
    void withdraw(double amount);
    void deposit(double amount);
}

class Sbi implements Bank {
    private double balance;

    public Sbi(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount % 500 == 0 && amount <= balance) {
            balance -= amount;
            System.out.println("SBI: Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("SBI: Withdrawal amount must be in multiples of 500 and less than or equal to balance.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 4000) {
            balance += amount;
            System.out.println("SBI: Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("SBI: Deposit amount cannot be more than 4000.");
        }
    }
}

class HDFC implements Bank {
    private double balance;

    public HDFC(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount % 1000 == 0 && amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("HDFC: Withdrawal amount must be in multiples of 1000 and less than or equal to balance.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 5000) {
            balance += amount;
            System.out.println("HDFC: Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("HDFC: Deposit amount cannot be more than 5000.");
        }
    }
}

class Axis implements Bank {
    private double balance;

    public Axis(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount % 100 == 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Axis: Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Axis: Withdrawal amount must be in multiples of 100 and less than or equal to balance.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 10000) {
            balance += amount;
            System.out.println("Axis: Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Axis: Deposit amount cannot be more than 10000.");
        }
    }
}

public class BankDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank sbi = new Sbi(10000);
        Bank hdfc = new HDFC(15000);
        Bank axis = new Axis(20000);

        System.out.println("Enter the Bank- 1.SBI, 2.HDFC, 3.AXIS:");
        int choice = sc.nextInt();
        if (choice == 1) { // SBI
            performBankOperation(sbi, sc);
        } else if (choice == 2) { // HDFC
            performBankOperation(hdfc, sc);
        } else if (choice == 3) { // AXIS
            performBankOperation(axis, sc);
        } else {
            System.out.println("Invalid Input!!");
        }
    }

    private static void performBankOperation(Bank bank, Scanner sc) {
        System.out.println("Enter the type of banking=> 1.WITHDRAW , 2.DEPOSIT:");
        int banking = sc.nextInt();
        if (banking == 1) {
            System.out.println("Enter the amount:");
            double amount = sc.nextInt();
            bank.withdraw(amount);
        } else if (banking == 2) {
            System.out.println("Enter the amount:");
            double amount = sc.nextInt();
            bank.deposit(amount);
        } else {
            System.out.println("Invalid Input!!");
        }
    }
}
