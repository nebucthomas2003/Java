import java.util.Scanner;

public class TT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int num = sc.nextInt();

        if (num<0) {
            System.out.println("The number is not absolute");
            int num1= -(num);
            System.out.println("Your converted number is "+num1);
            
        }
        else{
            System.out.println("The number is an absolute");
        }

        
    }
    
}
