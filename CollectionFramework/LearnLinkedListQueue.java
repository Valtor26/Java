package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue{
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.offer(12);
        que.offer(14);
        que.offer(16);

        System.out.println(que.poll()); // returns and deletes the head of the queue, returns null is queue is empty
        System.out.println(que.remove()); // returns and deletes the head of the queue, throws an exception is the queue is empty 
        System.out.println(que);

        System.out.println(que.peek()); // returns the head ie first element, returns null if empty

        System.out.println(que.element()); // returns the head of the queue, throws exception is queue is empty


    }
}