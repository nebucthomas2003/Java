public class MissingNum {//Find the missing element in the array
    public static void main(String[] args) {
        int a[] = { 1,2,3,4,5,7 };
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        // System.out.println(min);
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        // System.out.println(max);
        for (int i = min; i <= max - 1; i++) {
            if (i == a.length - 1) {
                break;
            } else if (a[i] != a[i + 1] - 1) {
                System.out.println(a[i] + 1);

            }

        }

    }
}
