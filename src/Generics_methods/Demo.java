package Generics_methods;

public class Demo {
    // must use wrapper
    Integer[] intArr = {1, 2, 3};
    String[] strArr = {"mtk", "st", "yma", "nyi"};

    public <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.println(x);
        }
    }

    //return type
    public <T> T getFirst(T[] array) {
        return array[0]; //will return T type
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.displayArray(demo.intArr);
        demo.displayArray(demo.strArr);
        System.out.println(demo.getFirst(demo.strArr));
        System.out.println(demo.getFirst(demo.intArr));
    }
}
