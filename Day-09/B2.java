
import java.util.Scanner;

public class B2 {

    public static void sameelements(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            int count =0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                   count++;
                }
                if (count==1) {
                    System.out.println("The common number is : "+arr1[i]);

                    
                }

            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of arr1:");
        int length = sc.nextInt();
        System.out.println("Size of arr2:");
        int length2 = sc.nextInt();

        int arr1[] = new int[length];
        int arr2[] = new int[length2];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the 1st array elements:");
            arr1[i] = sc.nextInt();

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter the second array elements:");
            arr2[i] = sc.nextInt();

        }

        sameelements(arr1, arr2);
        sc.close();

    
    }

}

