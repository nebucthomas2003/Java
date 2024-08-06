
import java.util.ArrayList;

public class remove {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();

        al1.add(10);
        al1.add(20);
        al1.add(30);

        al1.remove(al1.indexOf(10));
        System.out.println(al1);
    }
    
}
