package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min Heap
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder()); // Max Heap


        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        // Smallest value has the max priority, it uses min-heap under the hood

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
