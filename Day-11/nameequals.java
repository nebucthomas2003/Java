import java.util.Scanner;

public class nameequals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd name:");
        String str2= sc.nextLine();

        System.out.println(str1.equalsIgnoreCase(str2));


    }
    
}
