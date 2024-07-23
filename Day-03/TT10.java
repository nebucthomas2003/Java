import java.util.Scanner;
public class TT10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();


        if (num>0 || num%7==0 || num%10==7) {
            System.out.println("its a buzz");
            
        } else {
            System.out.println("its not a buzz");
        }
        sc.close();
    }
    
}
