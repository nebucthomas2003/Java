
import java.util.Scanner;

public class T4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();
        int ans = 0;

        for (int i = num1; i < num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans += i;
            }
        }
        System.out.println(ans);

    }

}


