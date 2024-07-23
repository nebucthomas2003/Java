
public class B8 {

    public static void main(String[] args) {
        int[][] a = {{21, 22, 23}, {24, 25, 22}, {27, 28, 29}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
            System.out.println(" ");
            //addition of 2d array
        }
        System.out.println(sum);

    }

}
