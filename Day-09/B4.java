
import java.util.Scanner;

public class B4 {

    public static void removeElement(int arr[], int pt, int length) {
       
        int newArr[] = new int[length - 1];
        
        
        for (int i = 0, j = 0; i < length; i++) {
            if (i != pt) {
                newArr[j++] = arr[i];
            }
        }

       
        System.out.println("New array after removing element:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + "th array element:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index number to remove:");
        int pt = sc.nextInt();

        removeElement(arr, pt, length);
    }
}
