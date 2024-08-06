
import java.util.ArrayList;

public class CopyingArray {//Copying elements from one array to another
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);

        ArrayList al2 = new ArrayList<>();
        al2.addAll(al1);
        System.out.println(al1);
        System.out.println(al2);
        
    }
    
}
