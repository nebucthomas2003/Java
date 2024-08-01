public class ReverseString {
//reverse the string
public static void main(String[] args) {
    String str1="I am Nebu";
    System.out.println(demos(str1));

    
}

static String demos(String str1){
        String ss ="";
        str1 = str1.trim();
        for (int i =0; i < str1.length();) {
            String temp="";
            for (int j = i; j < str1.length(); j++) {
                i++;
                if (str1.charAt(i)==' ') {
                
                    break;
                    
                }else{
                    
                    temp = temp + str1.charAt(j);
                }
                
            }

             
            char[] ch = str1.toCharArray();
            int start = 0;
            int end = ch.length-1;
            for (int k = 0; k < ch.length/2; k++) {
                char temp1 = ch[start];
                ch[start++] = ch[end];
                ch[end--] = temp1;
            }

            ss += String.valueOf(ch);

           

    }
    return ss;
}
}