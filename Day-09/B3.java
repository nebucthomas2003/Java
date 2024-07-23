import java.util.Scanner;

public class B3 {

    public static void addingElement(int arr[], int val, int pt, int length) {
        int newArr[] = new int[length + 1]; 
        
        for (int i = 0; i < pt; i++) {
            newArr[i] = arr[i];
        }
   
        newArr[pt] = val;
        
    
        for (int i = pt; i < length; i++) {
            newArr[i + 1] = arr[i];
        }

        
        System.out.println("New array after adding element:");
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
            System.out.println("Enter the " + (i + 1) + "array element:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value:");
        int val = sc.nextInt();
        System.out.println("Enter the index number:");
        int pt = sc.nextInt();

        addingElement(arr, val, pt, length);
        sc.close();
    }
}
