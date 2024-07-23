
public class B1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        if (array1.length != array2.length) {
            System.out.println("Arrays are not equal due to different lengths.");
        } else {
            boolean isEqual = true;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("Arrays are equal.");
            } else {
                System.out.println("Arrays are not equal at index " + isEqual);
            }
        }
    }
}
