public class CountingDuplicate { // Count of duplicate values
    public static void main(String[] args) {
        int a[] = { 10, 20, 10, 30, 30, 30, 45 };
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    count++;

                }

            }

        }
        System.out.println("Count of Duplicate values:");
        System.out.println(count);

    }

}
