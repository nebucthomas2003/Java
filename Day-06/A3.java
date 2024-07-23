import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if (n%2==0) {
            for (int i = 1; i <=n ; i++) {


                for (int j = 1; j < n; j++) {
    
                    if(i==j || i+j==n) {
    
                        System.out.print("*");
                        
                    } else {
                        System.out.print(" ");
                    }
                    
                }
                System.out.println();
            
        }
     } else {
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n; j++) {
    
                    if (i + j == n) {
                        System.out.print("*");
    
    
                    } else {
                        System.out.print(" ");
                    }
                    
    
                }
                System.out.println();
                
    
        }


       
            
        }
    }
    
}
