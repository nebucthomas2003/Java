
import java.util.Scanner;

public class T7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sunny = num + 1;
        boolean flag = false;

        for (int i = 0; i < num; i++) {
            if (i * i == sunny) {
                flag = true;
                break;

            }
        }
        if (flag == true) {
            System.out.println("it is a sunny number");

        } else {
            System.out.println("it is not sunny number");
        }

    }

}
