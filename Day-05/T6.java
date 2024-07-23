
import java.util.Scanner;

public class T6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int ans = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                ans += i;
            }
        }
        if (ans == num) {
            System.out.println("its a perfect number");
            System.out.println(ans);
           

            
            

        }

    }

}
