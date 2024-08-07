
import java.util.ArrayDeque;

class createArrayDequeue { // create an array dequeue, add elements in it using different methods and remove elements also from it.
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);

        System.out.println(ad);
        ad.remove();
        System.out.println(ad);
        ad.clear();
        System.out.println(ad);
    }
}