
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectionCommission ec = new ElectionCommission();
        System.out.println("Enter the nationality:");
        String nationality = sc.nextLine();
        ec.getnation();
        System.out.println("Enter the qualification:");
        String qualification = sc.nextLine();
        ec.getquali();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        ec.getage();

        if (nationality.equals("Indian")&&qualification.equals("Graduate")&&age>18) {
            System.out.println("Eligibele for voting!!");
            
        } else {
            System.out.println("Not eligible for voting");
        }
        

        
}
}
