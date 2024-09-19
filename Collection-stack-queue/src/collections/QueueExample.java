package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //priority queue follows sorting
        // using comparator
        Queue<String> queue=new PriorityQueue<>(String::compareTo);
        //Queue<String> queue=new LinkedList<>();
        queue.offer("kane");
        queue.offer("Javed");
        queue.offer("Zepher");
        queue.offer("mongo");
        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

    }
}
