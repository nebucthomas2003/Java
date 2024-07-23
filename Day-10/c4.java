import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char[] ch =  str.toCharArray();
        System.out.println("Enter the string to be removed:");
        char s1 = sc.next().charAt(0);

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==s1) {
                System.out.println();
                
            }
            
        }
        


    }
    
}
