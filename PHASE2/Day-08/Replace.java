public class Replace {// Replace the String with other

    public static void demo() {
        String str1 = "I am Nebu";
        String str2 = "Nebu";
        String str3 = "Thamizh";
        String str4 = new String();
        if (str1.contains(str2)) {
            str4 = str1.replace(str2, str3);
            System.out.println(str4);
        }

    }

    public static void main(String[] args) {
        demo();
    }
}
