public class B5 {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeZigZag(array1, array2);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeZigZag(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        boolean switchFlag = true;

        while (i < array1.length && j < array2.length) {
            if (switchFlag) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            switchFlag = !switchFlag;
            k++;
        }

        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
