
import java.util.Scanner;

public class c6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ' && ch[i + 1] != ' ') {
                count++;

            }
        }
        System.out.println(count + 1);
    }

}
