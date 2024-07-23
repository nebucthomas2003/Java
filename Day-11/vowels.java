
import java.util.Scanner;

public class vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1 = sc.nextLine();
        char[] ch = str1.toCharArray();
        int count = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'a' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count2++;

            } else if (ch[i] >= '1' && ch[i] <= '9') {
                count++;

            } else {
                count3++;
            }

        }
        System.out.println("Numerical:" + count);
        System.out.println("Vowels:" + count2);
        System.out.println("Consonants" + count3);

        sc.close();

    }

}
