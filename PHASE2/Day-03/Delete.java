
import java.util.Arrays;

public class Delete { // Delete an element from Array based on the index value provided by the user. Delete the zero also
    
    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        int a2[] = new int[a.length-1];
        int b = 1;
        int pointer=0;

        for (int i = 0; i < a.length; i++) {
            if (i != b) {
                a2[pointer] = a[i];
                pointer++;

            }

        }
        System.out.println("The original array: "+Arrays.toString(a));
        System.out.println("Array after deletion: "+Arrays.toString(a2));
       
    }

}

    