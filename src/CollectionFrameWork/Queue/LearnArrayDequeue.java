package CollectionFrameWork.Queue;

import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);// adds an element in last
        adq.offer(46);
        adq.offerFirst(89);// adds element in first  position
        adq.offerLast(90);// adds element in last positon same as offer().
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println("poll: "+adq.poll());
        System.out.println("pollfirst: "+adq.pollFirst());
        System.out.println("pollLast: "+adq.pollLast());
        System.out.println(adq);


    }
}
