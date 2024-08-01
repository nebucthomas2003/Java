
import java.util.*;

public class SecMax {// Second maximum
    public static void main(String[] args) {

        int a[] = { 3, 5, 2, 4, -1, 5, 5, 5, 4, 7, 7, 7 };
        int max = 0;
        int max2 = 0;
        // Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {

                max2 = max;
                max = a[i];

            }

            else if (max != a[i] && max2 < a[i]) {
                max2 = a[i];
            }

        }

        System.out.println(max2);

    }
}
