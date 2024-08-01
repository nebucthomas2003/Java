public class frequencystring { //find the frequency of the string element 
    public static void main(String[] args) {
        String str = "Nebu";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a'&& str.charAt(i)<='z') {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = false;
                }
            }
            if (flag) {
                int count = 0;
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(i) == str.charAt(k)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + "=" +count);
            }
            }

        }

    }

}
