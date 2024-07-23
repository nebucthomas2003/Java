
import java.util.Scanner;

public class c2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char[] st = str.toCharArray();
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (st[i] >= 'a' && st[i] <= 'z' || st[i] >= 'A' && st[i] <= 'Z' || st[i] <= '0' && st[i] >= '9') {

                if (st[i] >= 'a' && st[i] <= 'z') {
                    count++;

                } else if (st[i] >= 'A' && st[i] <= 'Z') {
                    count1++;

                } else {
                    count2++;
                }

            }

        }

        System.out.println("Lowercase:" + count);
        System.out.println("Uppercase:" + count1);
        System.out.println("Special:" + count2);
        sc.close();

    }

}
