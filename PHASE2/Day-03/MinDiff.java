import java.util.Arrays;

public class MinDiff { //find the minimum difference in an array
    public static void main(String[] args) {
        int a[] = { 1, 2, 30, 4, 7 };
        System.out.println("Orginal Array: "+Arrays.toString(a));
        
       
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        
       
        int minDiff = Integer.MAX_VALUE;
        

       
        for (int i = 0; i < a.length - 1; i++) {
            int diff = a[i + 1] - a[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

       
        System.out.println("Minimum difference: " + minDiff);
    }
}

