import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");         //to reverse a string
        String str = sc.nextLine();
        char [] ch =  str.toCharArray();

        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(ch[i]);
            
        }
        sc.close();



    
    }
    
}
