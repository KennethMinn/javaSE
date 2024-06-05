package Generic_classes;

public class MyGenericClass<T> {
    T x;

    MyGenericClass(T x) {
        this.x = x;
    }

    public T getValue() {
        return this.x;
    }
}
