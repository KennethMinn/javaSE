package HashMap;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        //must use wrapper
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("mtk", 18);
        empIds.put("st", 19);

        System.out.println(empIds); // { st=19, mtk=18 }
        System.out.println(empIds.get("mtk"));
        System.out.println(empIds.containsKey("mtk"));
        System.out.println(empIds.containsValue(18));
        System.out.println(empIds.put("mtk", 19)); //will override if the key exists
        System.out.println(empIds.replace("mtk", 18)); // will only replace if the key exists

    }
}
