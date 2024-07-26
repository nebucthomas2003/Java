
import java.util.Arrays;

public class DeleteElement {//Delete an element from an array
    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        int a2[] = new int[a.length-1];
        int delete = 20;
        int pointer = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != delete) {
                a2[pointer] = a[i];
                pointer++;

            }

        }
        System.out.println("The original array: "+Arrays.toString(a));
        System.out.println("Array after deletion: "+Arrays.toString(a2));

    }

}
