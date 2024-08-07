
import java.util.LinkedList;

public class duplicateLinked { // remove duplicate elemnets from the linked list
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(20);

        for (int i = 0; i < l1.size(); i++) {
            for (int j = i + 1; j < l1.size(); j++) {
                if (l1.get(i) == l1.get(j)) {
                    l1.remove(j);

                }

            }

        }
        System.out.println(l1);
    }

}
