package CollectionFrameWork.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();// This will the least element as priority
        pq.offer(10);// adding an element into a queue. add() can also be used but it throws exception if faces error
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());//Comparator.reverseOrder()

        Queue<Integer> usingComparator = new PriorityQueue<>(Comparator.reverseOrder());// This will the highest element as priority
        usingComparator.offer(10);// adding an element into a queue. add() can also be used but it throws exception if faces error
        usingComparator.offer(20);
        usingComparator.offer(30);
        usingComparator.offer(40);
        usingComparator.offer(50);
        System.out.println(usingComparator);
        usingComparator.poll();// This removes the element in a queue
        System.out.println(usingComparator);
        System.out.println(usingComparator.peek());// returns the element that is about to be removed

    }
}
