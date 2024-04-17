package twoDimensionalArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> shopList = new ArrayList<>();

        ArrayList<String> foodList = new ArrayList<String>();
        foodList.add("pizza");
        foodList.add("noodle");
        foodList.add("hamburger");

        ArrayList<String> clothList = new ArrayList<String>();
        clothList.add("Stussy");
        clothList.add("Dickies");
        clothList.add("Carhartt");

        shopList.add(foodList);
        shopList.add(clothList);

        System.out.println(shopList);
        System.out.println(shopList.get(0).get(0));
    }
}
