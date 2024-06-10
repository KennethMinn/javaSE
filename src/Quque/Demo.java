package Quque;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        //Standard Queue
        //queues are interfaces, and we can't implement them directly,
        //so we need to use a class that utilizes queue which is a linkedList
        Queue<String> quque = new LinkedList<>();
        quque.add("one");
        quque.add("two");
        quque.add("three");

        System.out.println(quque.poll()); //one
        System.out.println(quque.poll()); //two
        System.out.println(quque.poll()); //three
    }
}
