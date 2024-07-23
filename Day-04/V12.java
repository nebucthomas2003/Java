import java.util.Scanner;
public class V12 {                                     //Spy number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1= sc.nextInt();
        int reverse=1;

        while(num1>0){
            int digit = num1%10;
            reverse=reverse*digit;
            num1=num1/10;

            
        }
        System.out.println(reverse);

    }
    
}
