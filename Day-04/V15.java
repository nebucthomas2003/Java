import java.util.Scanner;
public class V15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch = sc.next().charAt(0);
        System.out.println("The Asci Values->");

        do { 
            System.out.println(ch+"--> "+(int)ch);
            ch++;
            
        } while (ch<='z');

        sc.close();

    
    }
    
}
