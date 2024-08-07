
import java.util.PriorityQueue;

public class peekQueue { //Using peek iterator we can print the first element that was added in the queue
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        System.out.println(pq);
        System.out.println(pq.peek());
       
    }

}
  