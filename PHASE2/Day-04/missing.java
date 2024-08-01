public class missing {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,14};
        int ans =0;
        for (int i = 0; i < a.length-1; i++) {
            int current = a[i];
            int next = a[i+1];

            if (next - current > 1) {
                for (int j = current + 1; j < next; j++) {
                    System.out.println(j);
                }
        }
    }
}
}
