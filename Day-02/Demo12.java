import java.util.Scanner;
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
        int num2 = num1*num1;

        if (num2>99) {
            System.out.println("the number is a three digit number");
            
        }

    }
    
}
