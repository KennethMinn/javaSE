package Linkedlist;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> lists = new LinkedList<>();
        lists.add("one");
        lists.add("two");
        lists.addFirst("First");
        lists.addLast("Last");
            
        for (String list : lists) {
            System.out.println(list);
        }
    }
}
