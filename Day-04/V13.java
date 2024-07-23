import java.util.Scanner;
public class V13 {                                     //Xylem and Phloem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        int outersum=0;
        int innersum=0;

        int sum = num%10;
        int a = num/10;

        while(a>9){
            int sum2= a%10;
            innersum= innersum+sum2;
            a=a/10;
        }
        outersum = sum+a;

        System.out.println(outersum);
        System.out.println(innersum);

        if (outersum==innersum) {
            System.out.println("It is a Xylem");
            
        } else {
            System.out.println("Its a Phloem");
        }


         
        
    }
    
}
