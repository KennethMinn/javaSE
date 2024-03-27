package InterfaceThetKhine;

import java.security.Key;

public class Demo {
    public static void main(String[] args) {
        USB usb = new Keyboard();
        usb.read();
        usb.write();

        usb = new Mouse();
        usb.read();
        usb.write();

        Mouse mouse = new Mouse();
        mouse.read();
        mouse.write();
    }
}
