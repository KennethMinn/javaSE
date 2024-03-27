package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {

        Predator predator_fish = new Fish();
        predator_fish.hunt();

        Prey prey_fish = new Fish();
        prey_fish.flee();

        //interface ------>implementation
        Predator predator = new Hawk(); //Program to interface, not implementation
        predator.hunt();

        //interface->implementation
        Prey prey = new Rabbit(); //Program to interface, not implementation
        prey.flee();
    }
}
