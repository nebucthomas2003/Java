import java.util.Scanner;
public class TT13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st num:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number:");  
        int num3 = sc.nextInt();

        if(num1%2==0 && num2%2==0 && num3%2==0){
            int product = num1*num2*num3;
            System.out.println("Th product is:"+product);
        }
        
        else if(num1%2==0 && num2%22==0){
            int sum= num1+num2;
            System.out.println("The sum is"+sum);
        }
        else if(num1%2==0){
            System.out.println("the even number is:"+num1);
        }
        else{
            System.out.println("None of the numbers are even");
        }

        sc.close();

    }
}
