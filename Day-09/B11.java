import java.util.Scanner;
public class B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the 2D array:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns in the 2D array:");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int sum=0;
        

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
              
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]==a[j]) {
                    System.out.println(" ");
                    System.out.println("The primary : "+a[i][j]);
                    sum=+(a[i][j]);
                   
                    
                }
                
            }
          
            
        }
        System.out.println("The sum is : "+sum);





    }





    
}

