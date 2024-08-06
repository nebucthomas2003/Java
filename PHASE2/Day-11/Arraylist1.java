
import java.util.ArrayList;

public class Arraylist1 {  //Arraylist in three different ways.
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(10);
        ArrayList al2 = new ArrayList<>(50);
        System.out.println(al2);


        ArrayList al3 = new ArrayList<>();
        al3.add(10);
        al3.add(20);
        al3.add(30);
        ArrayList al4 = new ArrayList<>(al3);
        System.out.println(al4);
       
    }

    
}
