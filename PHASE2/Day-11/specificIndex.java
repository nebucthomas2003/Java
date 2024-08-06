
import java.util.ArrayList;

public class specificIndex { // adding elements at the specific index
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(null);
        al1.add(1, 100);
        System.out.println(al1);
    }

}
