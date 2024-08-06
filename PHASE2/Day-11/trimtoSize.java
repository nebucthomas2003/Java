import java.util.ArrayList;

public class trimtoSize {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>(10);
        al1.add(10);
        al1.trimToSize();
        System.out.println(al1);
    }
    
}
