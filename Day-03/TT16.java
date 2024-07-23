import java.util.Scanner;
public class TT16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Th fruit that are available- 1.Apple, 2.Banana, 3.Orange or Mango");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 :{
                System.out.println("Apple");
                break;
            }
            case 2 :{
                System.out.println("Banana");
                break;
            }
            case 3 :{
                System.out.println("Orange");
                break;
            }
            case 4 :{
                System.out.println("Mango");
                break;
            }
                
                
            default:
                throw new AssertionError();
        }
        
    }
    
}
