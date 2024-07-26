
import java.util.Arrays;

public class ReverseArray { // Reverse the elements from one array to another array
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        int b[] = new int[a.length];
        int k = 0;

        for (int i = a.length - 1; i >= 0; i--) {

            b[k++] = a[i];
            System.out.println(Arrays.toString(b));

        }
        System.out.println("Old Array:");
        System.out.println(Arrays.toString(a));
        System.out.println("New Reversed Array:");
        System.out.println(Arrays.toString(b));

    }

}
