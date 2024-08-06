public class toggle {// toggle program
    public static void main(String[] args) {
        String s1 = " I am  nebu";
        char ch[] = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s1.length(); j++) {
                if (ch[i] == ' ') {
                    break;
                }
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] + 'A' - 'a');

                } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    ch[i] = (char) (ch[i] + 'a' - 'A');
                }
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
