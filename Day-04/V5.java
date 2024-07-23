import java.util.Scanner;

public class V5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Time");
        int time = sc.nextInt();
        System.out.println("Enter the age:");
        int age = sc.nextInt();

        if ((time>0 && time<13) ) {
            if(age>0 && age<= 13){
                System.out.println("10% discount");
            }
            else if(age>13 && age<65){
                System.out.println("25% Discount");
            }
        } else if(time<13 && (age>14 && age<64)) {
            System.out.println("No Discount");
        }
        else if(time>=13){
            System.out.println("Discount is not applicable");
        }
        else{
            System.out.println("Time is not correct");
        }
    }
    }

