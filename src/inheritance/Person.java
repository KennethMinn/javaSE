package inheritance;

public abstract class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}
