import java.util.Scanner;

public class SumArray { //Find the value corresponding to the user by checking the sum of two values from the array
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 3 };
        Scanner sc =new Scanner(System.in);
        int b=sc.nextInt();


        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    System.out.println("The values are:" + a[i] + " " + a[j]);

                }

            }

        }

    }

}
