package InterfaceThetKhine;

public class Mouse implements USB {
    @Override
    public void read() {
        System.out.println("mouse read");
    }

    @Override
    public void write() {
        System.out.println("mouse write");
    }
}
