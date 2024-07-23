import java.util.Scanner;
public class V4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();


        if (num%2==0) {
            System.out.println("The number is even");
        
            if (num%2==0 & num%5==0) {
                System.out.println("The number is divisible by 2 and 5");
                
            } else {
                System.out.println("The number is not visible by 2 and 5");
            }
            
            
        }else {
            System.out.println("The number is not divisible by 2");
        }

        sc.close();
    }
    
}
