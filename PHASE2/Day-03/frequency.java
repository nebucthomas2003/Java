import java.util.Arrays;

public class frequency { // frequency of a value in an array
    public static void main(String[] args) {
        int a[] = { 10, 20, 10, 30 };
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = false;
                }
            }
            if (flag) {
                int count = 0;
                for (int k = 0; k < a.length; k++) {
                    if (a[i] == a[k]) {
                        count++;
                    }
                }
                System.out.println("The frequency of " + a[i] + " is " + count);
                b[i] = a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
