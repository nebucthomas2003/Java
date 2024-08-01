public class firstletter { //Print the first letter of a string
    public static void main(String[] args) {

        String str = "hello i am nebu";
        System.out.println(str);
        System.out.println("The first letters are: ");
        for (int i = 0; i < str.length(); i++) {
            if (i==0) {
                System.out.println((char) (str.charAt(i)));

                
            }
            else if (str.charAt(i) == ' ') {
                System.out.println((char) (str.charAt(i + 1)));

            }

        }

    }

}
