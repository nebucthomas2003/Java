
import java.util.PriorityQueue;

public class createQueue { //Creating a queue and adding elements into it.
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(40);
        pq.offer(50);
        pq.offer(60);
        pq.offer(70);
        pq.offer(80);
        pq.offer(90);
        pq.offer(30);
        pq.offer(100);
        System.out.println(pq);
        pq.offer(110);
        System.out.println(pq);

    }
}
