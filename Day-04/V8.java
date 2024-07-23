import java.util.Scanner;
public class V8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd Number:");
        int b = sc.nextInt();

        
            while(a<b){
                if(a%2==0){
                    System.out.println("it is an even number" +a);
                }
                else{
                    System.out.println("it is an odd number" +a);
                }
                a++;
            }
        }
    }
    

