package PriorityQueue;

import java.util.*;

public class Demo {
    // Priority Queue = A Fifo data structure that serves elements
    //                  with the highest priorities first
    //                  before elements with lower priority

    public static void main(String[] args) {
        //Standard Queue
        //queues are interfaces, and we can't implement them directly,
        //so we need to use a class that utilizes queue which is a linkedList
//        Queue<Double> queue = new LinkedList<>();
//        queue.offer(3.0);
//        queue.offer(4.0);
//        queue.offer(2.5);
//        queue.offer(1.0);
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }


        //Priority Queue - if working with numbers or, these are arranged in ascending order -> so are strings
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // now desc order
        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(2.5);
        queue.offer(1.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
