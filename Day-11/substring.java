import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 ="nebu thomas";
        String str2 ="nebu thomas";


        String st1 = str1.substring(0,4);
        String st2 = str2.substring(0,4);
        System.out.println(st1.equals(st2));
    }
    
}
