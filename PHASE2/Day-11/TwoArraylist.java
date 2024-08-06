import java.util.ArrayList;

public class TwoArraylist {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        ArrayList al2 = new ArrayList<>();
        al2.add(10);
        al2.add(40);
        al2.addAll(1,al1);
        System.out.println(al1);
        System.out.println(al2);
        
    
    }
    
}
