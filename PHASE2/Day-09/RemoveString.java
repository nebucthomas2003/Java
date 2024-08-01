
public class RemoveString {
    public static void main(String[] args) {
        String str1 = "I am Nebu";
       
        char ch = 'N';

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ch) {
                System.out.print(str1.charAt(i));

            }

        }

    }

}
