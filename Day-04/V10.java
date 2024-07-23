import java.util.Scanner;
public class V10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp=num;
        int reverse=0;
        while(num>0){
            int digit = num%10;
            reverse= reverse*10+digit;
            num= num/10;
            
        }
        if(reverse==temp){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }

        sc.close();

    }
    
}
