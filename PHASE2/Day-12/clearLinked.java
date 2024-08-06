import java.util.LinkedList;

public class clearLinked { // clear method in a linked list
    public static void main(String[] args) {
        LinkedList li = new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);

        System.out.println(li);
        li.clear();
        System.out.println(li);

    }

}
