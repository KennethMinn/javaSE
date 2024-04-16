package Enum;

enum Planet {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE,
    PLUTO
}

enum Planet2 {
    EARTH(1),
    JUPITER(2);
    int number;

    Planet2(int number) {
        this.number = number;
    }
}

public class Demo {
    static void canLive(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.println("can live");
                break;
            default:
                System.out.println("can't live");
                break;
        }
    }

    public static void main(String[] args) {
        Planet myPlanet = Planet.EARTH;
        canLive(myPlanet); //can live

        Planet2 myPlanet2 = Planet2.JUPITER;
        System.out.println(myPlanet2); //JUPITER
        System.out.println(myPlanet2.number); //2
    }
}
