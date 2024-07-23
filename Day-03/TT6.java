import java.util.Scanner;
public class TT6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the character:");
        char word = sc.next().charAt(0);
    

        if (word >= 65 && word <= 90) {
            System.out.println("The word is in Uppercase");
            
        } else {
            System.out.println("The word is in Lowercase");
        }
        
    }
}
