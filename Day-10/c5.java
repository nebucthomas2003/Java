import java.util.Scanner;
public class c5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char [] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='a' && ch[i]<='z') {
                System.out.print((char)(ch[i]-32));
                
            }else{
                System.out.print((char)(ch[i]));
            
            
        }
    }
    }
}
