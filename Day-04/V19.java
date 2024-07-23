import java.util.Scanner;

public class V19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

       

        while (true) {
            System.out.println("\nTransaction Types:");
            System.out.println("1. Withdrawal");
            System.out.println("2. Credit Amount");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1, 2, 3, or 4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (balance >= withdrawalAmount) {
                        balance -= withdrawalAmount;
                        System.out.println("Withdrawal processed. Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds. Withdrawal cannot be processed.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    balance += creditAmount;
                    System.out.println("Amount credited. Remaining balance: " + balance);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}
