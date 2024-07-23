import java.util.Scanner;
public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        double temp = sc.nextDouble();
        double celsius = (temp - 32) * 5/9;

        if (celsius>35) {
            System.out.println("Due to high temperature college is on leave");
            
        } else {
            System.out.println("College is open today");
        }



    
    }
           

    
}
