import java.util.Arrays;

public class SortArray {     // Sorting an Array in both ascending and descending order. For that just change the ">" symbol//
    public static void main(String[] args) {
        int a[] = { 10, 20, 25, 9, 5 };
        System.out.println("The Process of changing:");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                System.out.println(Arrays.toString(a));
            }
        }
        System.out.println("Array after sorted");
    }
}
