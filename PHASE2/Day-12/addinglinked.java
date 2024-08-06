
import java.util.LinkedList;

public class addinglinked { //Adding an element at the third index place
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        l1.add(90);
        l1.add(100);
        System.out.println(l1);
        l1.add(3, 1000);
        System.out.println(l1);

    }

}
