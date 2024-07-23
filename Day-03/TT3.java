import java.util.Scanner;

public class TT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2= sc.nextInt();

        if (num1>num2) {
            System.out.println("1st number is max");
            
        } else {
            System.out.println("2nd number is max");
        }
    }
    
}
