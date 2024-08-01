public class CountWords { //count the number of words present in a string
    public static void main(String[] args) {
        String str1 = "    I am Nebu"; 
        str1=str1.trim();
    
        int count = 0;

        for (int i = 0; i < str1.length() - 1;) {
            String temp = "";
            for (int j = i; j < str1.length() - 1; j++) {

                if (str1.charAt(i) == ' ') {
                    i++;
                    break;

                } else {
                    i++;
                    temp = temp + str1.charAt(i);

                }

            }
            if (temp == temp) {
                count++;

            }

        }
        System.out.println(count);
    }

}
