import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value:");
        int base =  sc.nextInt();
        System.out.println("Enter the exponent value:");
        int exp = sc.nextInt();
        int result = 1;

        for (int i = 0; i < exp; i++){
            result= result*base;
                 
        }
        System.out.println(result);
    }
}
