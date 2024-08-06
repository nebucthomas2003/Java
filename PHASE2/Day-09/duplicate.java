public class duplicate {
    public class DuplicateStrings {
        public static void main(String[] args) {
            String str1 = "     shhs  I am Nebu Nebu              jijdj Nebu";
            str1 = str1.trim();
    
            int count = 0;
            for (int i = 0; i < str1.length()-1;) {
                String temp = "";
                for (int j = i; j < str1.length()-1; j++) {
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
    
            String[] str2 = new String[count];
            int index = 0;
            for (int i = 0; i < str1.length();) {
                String temp = "";
                for (; i < str1.length() && str1.charAt(i) == ' '; i++);
                for (; i < str1.length() && str1.charAt(i) != ' '; i++) {
                    temp += str1.charAt(i);
                }
                if (!temp.isEmpty()) {
                    str2[index++] = temp;
                }
            }
    
            for (int m = 0; m < count; m++) {
                if (str2[m] == null)
                    continue;
    
                int count2 = 1;
                for (int n = m + 1; n < count; n++) {
                    if (str2[m].equals(str2[n])) {
                        count2++;
                        str2[n] = null;
                    }
                }
    
                System.out.println("The count of '" + str2[m] + "' is " + count2);
            }
        }
    }
    
    
}
