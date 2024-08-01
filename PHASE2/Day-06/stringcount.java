public class stringcount { // checking the count of particular character
    static int countstring(String str, char ch) {
        int count = 0;
        if (ch >= 'a' && ch <= 'z') {
            str = str.toLowerCase();

        } else {
            str = str.toUpperCase();
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;

            }

        }
        return count;

    }

    public static void main(String[] args) {
        String str = "AbsScshdhaa";
        char ch = 's';
        int ans = countstring(str, ch);
        System.out.println("The count of " + ch + " is " + ans);

    }

}
