import java.util.Scanner;
public class Demo10 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the 1st num:");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd Num:");
        int num2 = sc.nextInt();

        int num3 = num1*num2;

        if(num3%3==0 && num3%5==0) {
            System.out.println("Its is divisible by 3");
            
        } else {
            System.out.println("Not divisible");
        }
    }
    
}
