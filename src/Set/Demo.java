package Set;

import java.util.HashSet;
import java.util.Set;

//set has no duplicate like array or ArrayList
public class Demo {
    public static void main(String[] args) {
        //no duplicate , fast at searching
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("hello");

        System.out.println(set); //[hi , hello] - no duplicate
    }
}
