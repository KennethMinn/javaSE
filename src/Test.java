public class Test {

    private String greet = "hello";

    public void instance_hello() {
        System.out.println("instance hello " + this.greet + " or " + greet);
    }

    public static void static_hello() {
        Test obj = new Test();
        System.out.println("static hello " + obj.greet);
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.instance_hello();
        static_hello();
    }
}
