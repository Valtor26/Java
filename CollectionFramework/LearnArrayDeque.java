package CollectionFramework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10);
        adq.offer(20);
        adq.offer(30);

        System.out.println(adq);

        adq.offerFirst(40); // insert 40 at front head
        adq.offerLast(5); // insert 5 at the last head
        System.out.println(adq); 

        System.out.println(adq.peek()); // return front head
        System.out.println(adq.peekFirst()); // return front head
        System.out.println(adq.peekLast()); // return last head


        System.out.println(adq.poll()); // returns and removes the front head
        System.out.println(adq.pollFirst()); // returns and removes the front head
        System.out.println(adq.pollLast()); // // returns and removes the last head

        System.out.println(adq);
    }
}
