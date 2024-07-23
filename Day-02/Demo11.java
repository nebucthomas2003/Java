import java.util.Scanner;
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();


        if (name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o")|| name.contains("u")) {
            System.out.println("It contains the vowels");
            
        }
    }
    
}
