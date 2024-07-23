
import java.util.Scanner;

public class PrismObject {
    public static void main(String[] args) {
        PrismVolume prismVolume= new PrismVolume();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        double base = sc.nextDouble();
        prismVolume.getbase();
        System.out.println("Enter the height:");
        double height = sc.nextDouble();
        prismVolume.getheight();
        System.out.println("Enter the length:");
        double length = sc.nextDouble();
        prismVolume.getlength();

        double volume= base*height;

        System.out.println("Volume is:"+volume);

        sc.close();

    }

  



  

    
}
