package CollectionFrameWork;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);// adding an element into a queue. add() can also be used but it throws exception if faces error
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);
        System.out.println(queue.peek());//returns the element that is about to get removed. element() can also be used but it throws exception if faces error
        queue.poll();// removes an element from the queue. remove() method can also be used but it throws exception if any error occurs
        System.out.println(queue);
    }
}
