import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String sr = sc.nextLine();

        char a = sr.charAt(0);
        char b = sr.charAt(sr.length()-1);

        System.out.println("the first letter:"+a);
        System.out.println("the last letter:"+b);

        
    }
    
}
