public class sample8 {// minimum value from array

    public static void main(String[] args) {
        int a[] = { 70, 30, 41, 78 };
        int min = a[0];
        for (int i = 0; i <=a.length-1; i++) {
            if (a[i] < min) {
                min = a[i];

            }

        }
        System.out.println(min);

    }
}
