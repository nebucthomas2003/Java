import  java.util.Scanner;
public class TT11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side:");
        int side1 = sc.nextInt();
        System.out.println("Enter the 2nd side:");
        int side2 = sc.nextInt();
        System.out.println("Enter the 3rd side:");
        int side3 = sc.nextInt();

        int square1 = side1*side1;
        int square2 = side2*side2;

        int sum = square1+square2;
        if (sum==side3) {
            System.out.println("The sum of the squares are equal:"+sum);
            
        } else {
            System.out.println("The sum of the squares are not equal");
        }

    sc.close();



    }
    
}
