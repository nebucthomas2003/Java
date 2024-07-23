
import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrimony m1 = new Matrimony();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        m1.getname();
        System.out.println("Enter the gender:");
        String gender = sc.nextLine();
        m1.getgender();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        m1.getage();

        if (.equals("Indian") && qualification.equals("Graduate") && age > 18) {
            System.out.println("Eligibele for voting!!");

        } else {
            System.out.println("Not eligible for voting");
        }

    }
}

}
