package ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //ArrayList<Wrapper>
        ArrayList<String> foods = new ArrayList<>();

        foods.add("pizza");
        foods.add("noodle");
        foods.add("hamburger");

        foods.set(0, "sushi"); //replace pizza with sushi
        foods.remove(2); //remove hamburger - O(n) time complexity
        //foods.clear(); //clear arraylist

        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
    }
}
