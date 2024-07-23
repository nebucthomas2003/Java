import java.util.Scanner;
public class TT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price 1:");
        double product1 = sc.nextDouble();

        System.out.println("Enter the 2nd price:");
        double product2 = sc.nextDouble();

        System.out.println("Enter the 3rd price:");
        double product3 =sc.nextDouble();

        double price= product1+product2+ product3;

        if (price>5000) {
            double discount = (price/100*15);
            System.out.println("The discount is"+discount);
            System.out.println("Original Price:"+price);

            System.out.println("You are eligible for discount and total price is:"+(price-discount));
            
        } else {
            System.out.println("The price is "+price);
        }

    
    }
    
}
