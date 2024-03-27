package InterfaceThetKhine;

public class Keyboard implements USB {
    @Override
    public void read() {
        System.out.println("Keyboard read");
    }

    @Override
    public void write() {
        System.out.println("Keyboard write");
    }
}
