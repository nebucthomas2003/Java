public class wordcount {
    public static void main(String[] args) {
        String s1 = "I am Nebu";
        int count = 0;
        for (int i = 0; i < s1.length();) {
            String temp = "";
            for (int j = i; j < s1.length(); j++) {
                if ((s1.charAt(i) == ' ')) {
                    i++;
                    break;
                } else {
                    temp = s1.charAt(i) + temp;
                    i++;
                }

            }
            if (temp == temp) {
                count++;

            }

        }
        System.out.println("The number of words in the string is " + count);
    }

}
