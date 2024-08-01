public class Uppercase {
    public static void main(String[] args) {
        String str = "hello i am nebu";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                
                System.out.print(str.charAt(i)-32);
                i++;

            } else if (str.charAt(i) == ' ') {
                System.out.print(" ");
                System.out.print((char) (str.charAt(i + 1) - 32));
                i++;

            } else {
                System.out.print(str.charAt(i));
            }

        }

    }
}
