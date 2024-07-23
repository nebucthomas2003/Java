import java.util.Scanner;
public class TT17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        System.out.println("Value:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 :{
                System.out.println("sunday");
                break;
            }
            case 2 :{
                System.out.println("Monday");
                break;
            }
            case 3 :{
                System.out.println("Tuesday");
                break;
            }
            case 4 :{
                System.out.println("Wednesday");
                break;
            }
            case 5 :{
                System.out.println("Thursday");
                break;
            }
            case 6 :{
                System.out.println("Friday");
                break;
            }
                
                
            default:
                throw new AssertionError();
        }

        }
    }
    

