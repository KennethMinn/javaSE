//Returning Object

public class Money {
    private int value;

    public Money(int value) {
        this.value = value;
    }

    public Money Add(Money b) {
        return new Money(this.value + b.value);
    }

    //Overwriting built-in toString Method to see the log
    public String toString() {
        return "toString " + this.value;
    }

    public static void main(String[] args) {
        Money a = new Money(100);
        Money b = new Money(100);
        Money c = a.Add(b);
        System.out.println(c); // toString will run when string concat
    }
}
