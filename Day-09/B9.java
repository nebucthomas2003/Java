
import java.util.Scanner;

public class B9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the 2D array:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns in the 2D array:");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int max = a[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        System.out.println("The largest value in the 2D array is: " + max);
    }
}
