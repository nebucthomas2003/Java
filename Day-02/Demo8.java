import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age<18) {
            System.out.println("Your name is :"+name);
            System.out.println("You are not eligible");
            
        } else {
            System.out.println("Your name is :"+name);
            System.out.println("You are eligible");

        }
    
    }
    
}
