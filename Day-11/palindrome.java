import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str1 = sc.nextLine();
        char[] ch = str1.toCharArray();
        String str2 = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            str2 += ch[i];
        }

        if (str1.equals(str2)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
