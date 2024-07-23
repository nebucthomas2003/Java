import java.util.Scanner;
public class TT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary:");
        double salary= sc.nextDouble();

        System.out.println("Enter the years of experience:");
        int experience = sc.nextInt();

        if (experience>5) {
            double bonus = (salary/100*5)+salary;
            System.out.println("The salary with bonus is:"+bonus);
            
        } else {
            System.out.println("You are not eligible for bonus:"+salary);
        }
    }
    
}
