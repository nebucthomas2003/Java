import java.util.Scanner;
public class TT18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the T-shirt:");
        int price= sc.nextInt();

        if (price>500) {
            int discount = price/100 * 10;
            System.out.println("The discount is: "+discount);
            int total = price-discount;
            System.out.println("Total Price: "+total);
            
        } else {
            System.out.println("You are not eligible for discount and total price: "+price);
        }

    
        
    }
}
