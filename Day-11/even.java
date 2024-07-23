import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1 = sc.nextLine();
        str1.toLowerCase();
        char[] ch = str1.toCharArray();
        

        for (int i = 0; i < ch.length; i++) {
            if (i%2==0 && ch[i]!=' ') {
                System.out.print((char)(ch[i]-32));
                
            }
            else{
                System.out.print(ch[i]);
            }
            
        }
    }
    
}
