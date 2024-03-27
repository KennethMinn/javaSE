package ExtendedInterface;

public class ExtendedInterface implements Third {

    @Override
    public void first() {
        System.out.println("first");
    }

    @Override
    public void second() {
        System.out.println("second");
    }

    @Override
    public void third() {
        System.out.println("third");
    }
}
