import java.util.Scanner;

public class V3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter:");
        char letter= sc.next().charAt(0);

        if(letter>'A' && letter<='Z'  || letter>='a' && letter<='z'){
            if (letter>='a'&letter<='z') {
                System.out.println("It is lowercase");
                
            } else {
            }
        }
    }
    
}
