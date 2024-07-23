import java.util.Scanner;

public class T10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int val = sc.nextInt();
        int count = 0;
        int temp = val;
        int ans = 0;

        while (temp > 0) {
            int digit = temp % 10;
            count++;

            int digitPower = 1;
            for (int i = 1; i <= count; i++) {
                digitPower *= digit;
            }
            ans += digitPower;

            temp = temp / 10;
        }

        if (ans == val) {
            System.out.println(val + " is an Armstrong number.");
        } else {
            System.out.println(val + " is not an Armstrong number.");
        }
        sc.close();

    }
}
