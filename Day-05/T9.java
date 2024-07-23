
import java.util.Scanner;

public class T9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;

        while (num > 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = digit; i > 1; i--) {
                fact = fact * i;

            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("its a strong number");
        } else {
            System.out.println("its not a strong number");
        }

    }
}
