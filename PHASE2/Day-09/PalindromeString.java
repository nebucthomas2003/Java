public class PalindromeString {
    public static void main(String[] args) {
        String s1 = "Malayalam";
        String s2 = "";
        s1=s1.toLowerCase();

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);

        }
        System.out.println(s1);
        if (s2.equals(s1)) {
            System.out.println("its a palindrome");
            
        }else{
            System.out.println("its not a palindrome");
        }

    }

}
