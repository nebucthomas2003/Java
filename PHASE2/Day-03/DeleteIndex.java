
import java.util.Arrays;

public class DeleteIndex { // Delete an element from Array based on the index value provided by the user
    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        int a2[] = new int[a.length];
        int b = 1;

        for (int i = 0; i < a.length; i++) {
            if (i != b) {
                a2[i] = a[i];

            }

        }
        System.out.println("The original array is: "+Arrays.toString(a));
        System.out.println("The array after deletion: "+Arrays.toString(a2));
    }

}
