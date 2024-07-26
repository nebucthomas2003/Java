public class Minimum {
    public static void main(String[] args) {
        int a[] = { 5, 1, 20, 10, 20, 30, 10 };
        int minVal = 200;
        int minVar1 = a[0];
        int minVar2 = a[1];

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] - a[j] < minVal && a[i] > a[j]) {
                    minVal = a[i] - a[j];
                    minVar1 = a[i];
                    minVar2 = a[j];

                }
                if (a[i] - a[j] < minVal && a[j] > a[i]) {
                    minVal = a[j] - a[i];
                    minVar1 = a[i];
                    minVar2 = a[j];

                }

            }

        }
        System.out.println("The main difference bwn " + minVar1 + " and " + minVar2 + " is : " + minVal);

    }

}
