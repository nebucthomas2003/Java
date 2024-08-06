
import java.util.ArrayList;

public class PrintArray { //Print all the elements using the for loop
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);

        for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
            
        }
    }
    
}
