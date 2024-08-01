import java.util.Arrays;

public class sortstring {
    public static void main(String[] args) {
        String str []={"apple","banana","orange","kiwi"};
        int a [] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            s = s.trim();
            s = s.toLowerCase();
            a[i]= s.charAt(0);
            
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]> a[j]) {
                    int temp= a[i];
                    String temp1 = str[i];
                    a[i]=a[j];
                    str[i]=str[j];
                    a[j]=temp;
                    str[j]=temp1;
                    
                }

                
            }
            
        }System.out.println(Arrays.toString(str));
         

        
    }
    
}
