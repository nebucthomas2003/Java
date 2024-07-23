import java.util.Scanner;
public class V18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        String day = sc.nextLine();

        switch (day) {
            case "Monday" :{
                System.out.println("Basketball");
                break;
            }
            case "Tuesday" :{
                System.out.println("Tennis");
                break;
            }
            case "Wednesday" :{
                System.out.println("Basketball");
                break;
            }
            case "Thursday" :{
                System.out.println("Cricket");
                break;
            }
            case "Friday" :{
                System.out.println("Tennis");
                break;
            }
            case "Saturday" :{
                System.out.println("Exercise");
                break;
            }
            case "Sunday" :{
                System.out.println("Holiday");
                break;
            }
                
            
            default:
                throw new AssertionError();

                
        }
        sc.close();
    }
    
}
