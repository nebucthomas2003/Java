import java.util.Arrays;

public class AnagramChecker { //check whether a string is anagram or not
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram = Arrays.equals(charArray1, charArray2);

            if (isAnagram) {
                System.out.println("It's an anagram");
            } else {
                System.out.println("It's not an anagram");
            }
        } else {
            System.out.println("It's not an anagram");
        }
    }
}
