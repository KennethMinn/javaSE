package Generic_classes;

public class Demo {
    //bad
    MyInteger integer_class = new MyInteger(1);
    MyString string_class = new MyString("hello");

    //Good
    MyGenericClass<Integer> generic_class = new MyGenericClass<>(1);
    MyGenericClass<String> generic_class2 = new MyGenericClass<>("hello");
}
