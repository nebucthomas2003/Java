import java.util.ArrayList;

public class ArrayItter { //use for each
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);

        for (Object al2: al1) {
            System.out.println(al2);
            
        }
    }
    
}
