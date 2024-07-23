import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int fact = 1;
        int temp = num;

        for (int i = 1; i < num; i++) {
            fact = fact*temp;
            temp--;
            
        }
        System.out.println("The factorial of the number is :" +fact);
        sc.close();
    }
    
}
