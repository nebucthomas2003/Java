
import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,2};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(a[i] == -1 ) continue;
            int count=1;
            for (int j = i+1; j < a.length; j++) {
                
                if (a[i]==a[j]) {
                    count++;
                    a[j] = -1;
                }
                
            }
            System.out.println("The frequency of "+a[i]+" is: "+count);            
        }
    }
    
}
