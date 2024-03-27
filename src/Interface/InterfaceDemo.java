package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        Predator predator = new Hawk();
        Hawk hawk = new Hawk();
        hawk.hunt();

        Prey prey = new Rabbit();
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
    }
}
