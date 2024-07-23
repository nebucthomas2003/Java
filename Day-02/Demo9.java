import java.util.Scanner;
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd Number:");
        int num2 = sc.nextInt();

        int num3 = num1+num2;

        if (num3%8==0) {
            System.out.println("The number is divisible by 8");
            
        }

        
    }
    
}
