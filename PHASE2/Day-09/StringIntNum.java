public class StringIntNum {// Add string and INT
    public static void main(String[] args) {
        String s1="123";
        int num=0;

        for (int i = 0; i < s1.length(); i++) {
            int temp = s1.charAt(i);
            int tempNum = temp-'0';
            num = num*10 + tempNum;
            
            
        }
        System.out.println(num+123);
    }
    
}
