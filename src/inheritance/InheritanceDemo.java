package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Person hero = new Hero("mtk", 18, "Coder"); // reference Person -> better
        Hero hero1 = new Hero("mtk", 18, "Coder");  // reference Hero
        System.out.println(hero.toString());
        
    }
}
