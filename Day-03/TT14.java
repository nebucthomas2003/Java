import java.util.Scanner;
public class TT14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int mark= sc.nextInt();

        if(mark>90){
            System.out.println("Excellent");
        }
        else if(mark>=60 && mark<=90){
            System.out.println("Average");
        }
        else if(mark>=40 && mark<60){
            System.out.println("Not Bad");
        }
        else{
            System.out.println("Bad Conduct");
        }

    }
    
}
