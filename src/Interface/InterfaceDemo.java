package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {

        Predator predator_fish = new Fish(); //Program to interface, not implementation
        predator_fish.hunt();

        Prey prey_fish = new Fish(); //Program to interface, not implementation
        prey_fish.flee();

        //interface ------>implementation
        Predator hawk = new Hawk(); //Program to interface, not implementation
        hawk.hunt();

        //interface->implementation
        Prey rabbit = new Rabbit(); //Program to interface, not implementation
        rabbit.flee();
    }
}
