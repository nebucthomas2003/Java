import java.util.Scanner;
public class TT12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
        

        if(num1%3==0){
            System.out.println("Sanju loves geetha");
        }
        else if(num1%5==0){
            System.out.println("Getha loves sanju");

        }
        else if(num1%3==0 && num1%5==0){
            System.out.println("Sanju and Geetha weds");

        }
        else{
            System.out.println("They break up");
        }

    }
}
