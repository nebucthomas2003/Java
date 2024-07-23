import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int square = number * number;
        int digitSum = 0;
        while(square != 0) {
            digitSum += square % 10;
            square /= 10;
        }
        
        if(digitSum == number) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
        scanner.close();
    }
}
