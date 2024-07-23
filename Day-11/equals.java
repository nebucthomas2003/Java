import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string:");
        String str2 = sc.nextLine();

       System.out.println(str1.equals(str2));
    }
    
}
