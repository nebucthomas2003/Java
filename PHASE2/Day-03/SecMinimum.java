import java.util.Arrays;

public class SecMinimum { //find the second minimum value from the array
    public static void main(String[] args) {
        int a[] = {-1, 3, 3, 4, 4, 5, 6, 7 };

        Arrays.sort(a);

        int min = a[0];
        int secMin = 200;
        boolean found = false;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != min) {
                secMin = a[i];
                found = true;
                break;
            }
        }

       
        if (found) {
            System.out.println("The second minimum value is: " + secMin);
        } else {
            System.out.println("There is no second minimum value.");
        }
    }
}
