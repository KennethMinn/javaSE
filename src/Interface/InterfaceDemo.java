package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        //interface ------>implementation
        Predator predator = new Hawk(); //Program to interface, not implementation
        predator.hunt();

        //interface->implementation
        Prey prey = new Rabbit(); //Program to interface, not implementation
        prey.flee();
    }
}
