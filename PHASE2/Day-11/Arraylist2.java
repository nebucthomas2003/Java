import java.util.ArrayList;

public class Arraylist2 {//Create an arralist using three methods
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        System.out.println(al1);

        ArrayList al2 = new ArrayList(5);
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        System.out.println(al2);

        ArrayList al3 = new ArrayList(al2);
        System.out.println(al3);
    }

    
    
}
