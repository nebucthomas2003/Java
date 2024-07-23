import java.util.Scanner;

public class upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1 = sc.nextLine();
        char[] ch =  str1.toCharArray();
        boolean Space = true;

        for (int i = 0; i < ch.length; i++) {
          
            if (ch[i] == ' ') {
                Space = true;
            }
            
            else if (Space) {
                
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char)(ch[i] - 32);
                }
                Space = false;
            }
        }

    
        String result = new String(ch);
        System.out.println("Result: " + result);
    }
}
