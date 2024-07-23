import java.util.Scanner;
public class TT20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();

        if(age>0 && age<=12){
            System.out.println("Ticket rate is 5");
        }
        else if(age>=13 && age<=17){
            System.out.println("Ticket rate is 8");
        }

        else if(age>=18 && age<=64){
            System.out.println("Ticket rate is 12");
        }
        else if (age>=65){
            System.out.println("Ticket rate is 7");

            sc.close();
        }
    }
    
}
