import java.util.Scanner;
public class TT15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time:");
        int time = sc.nextInt();

        if(time>=6 && time<11){
        System.out.println("Good Morning!");
        }
       else if(time>=12 && time<17){
        System.out.println("Good Afternoon");
        }
       else if(time>=17 && time<21){
        System.out.println("Good Evening");
       }
       else if (time>=21 || time<4){
        System.out.println("Good Night");
        
       }
       sc.close();
    }
    
    
}
