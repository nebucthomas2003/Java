
import java.util.Arrays;

public class CopyingElements {//copying elements from 1 array to another array
    public static void main(String[] args) {
        int a1[]={10,20,30,40,50};
        int a2[]=new int[5];
        for(int i = 0; i < a1.length; i++) {
            a2[i]=a1[i];
            
        }   
        System.out.println("1st Array:");
        System.out.println(Arrays.toString(a1));
        System.out.println("2nd Array:");
        System.out.println(Arrays.toString(a2));
    }

    
}

