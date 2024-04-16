package polymorphism;

public class Polymorphism {
    static void workEveryone(Human[] humans) {
        for (Human h : humans) {
            h.work();
        }
    }

    // int[] = {1,2} === int[] = new int[]{1,2}
    public static void main(String[] args) {
        Human[] humans = new Human[]{
                new Doctor(),
                new Teacher()
        };
        workEveryone(humans);
    }
}
