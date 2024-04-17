package wrapper;

public class Demo {


    public static void main(String[] args) {

        //auto boxing - primitive -> wrapper
        Boolean a = true;
        Character b = '@';
        Integer c = 1;
        Double d = 3.142;
        String e = "BRO";

        //a.method(); // can use methods

        //unboxing - can use them as a primitive too
        if (a == true) {
            System.out.println("true");
        }
    }
}
