public class DuplicateCount {// Print the duplicate values in an
    public static void main(String[] args) {
        int a[] = { 10, 20, 10, 30, 10, 20, 20, 30, 30 };
        System.out.println("Duplicate values present in the array :");

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;

                }

            }
            if (count == 1) {
                System.out.println(a[i]);

            }

        }

    }

}
