
import java.util.Scanner;

abstract class Bank {
    protected double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
}







class Sbi extends Bank {

    public Sbi(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount % 500 == 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Sbi: Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Sbi: Withdrawal amount must be in multiples of 500 and less than or equal to balance.");
    
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 4000) {
            balance += amount;
            System.out.println("Sbi: Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Sbi: Deposit amount cannot be more than 4000.");
        }
    }
}









class HDFC extends Bank {

    public HDFC(double balance) {
        super(balance);
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












class Axis extends Bank {

    public Axis(double balance) {
        super(balance);
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
        if (choice==1) {//sbi
            System.out.println("Enter the type of banking=> 1.WITHDRAW , 2.DEPOSIT:");
            int banking = sc.nextInt();
            if (banking==1) {
                System.out.println("Enter the amount:");
                double amount = sc.nextInt();
                sbi.withdraw(amount);
                
            } else if(banking==2) {
                System.out.println("Enter the amount:");
                double amount2= sc.nextInt();
                sbi.deposit(amount2);
            }
            else{
                System.out.println("Invalid Input!!");
            }


            
        }
        else if (choice==2) {
            System.out.println("Enter the type of banking=> 1.WITHDRAW , 2.DEPOSIT:");
            int banking = sc.nextInt();
            if (banking==1) {
                System.out.println("Enter the amount:");
                double amount = sc.nextInt();
                hdfc.withdraw(amount);
                
            } else if(banking==2) {
                System.out.println("Enter the amount:");
                double amount2= sc.nextInt();
                hdfc.deposit(amount2);
            }
            else{
                System.out.println("Invalid Input!!");
            }

            
        }
        else if (choice==3) {
            System.out.println("Enter the type of banking=> 1.WITHDRAW , 2.DEPOSIT:");
            int banking = sc.nextInt();
            if (banking==1) {
                System.out.println("Enter the amount:");
                double amount = sc.nextInt();
                axis.withdraw(amount);
                
            } else if(banking==2) {
                System.out.println("Enter the amount:");
                double amount2= sc.nextInt();
                axis.deposit(amount2);
            }
            else{
                System.out.println("Invalid Input!!");
            }

            
        }
        else{
            System.out.println("Invalid Input!!");
        }
        

        }

      
    }

