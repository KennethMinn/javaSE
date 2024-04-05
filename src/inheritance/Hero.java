package inheritance;

public class Hero extends Person {
    //super -> obj instance of Person
    //super() -> Person constructor

    String power;

    Hero(String name, int age, String power) {
        super(name, age); // Person()
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + this.power;
    }
}
