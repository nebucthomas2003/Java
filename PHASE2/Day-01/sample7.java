
public class sample7 { // maximum value from array
    public static void main(String[] args) {
        int a[] = { 70, 30, 41, 78 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }
           

        } System.out.println(max);

    }
}
