import java.util.ArrayList;

public class removeAll {//remove all method
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);

        System.out.println(al1);

        al1.removeAll(al1);
        System.out.println(al1);
    }
    
}
