public class Account {
    private int balance;
    public  void debit (int amount) {
        this.balance -= amount;
    }
    public  void credit (int amount) {
        this.balance += amount;
    }

    public  int getBalance () {
        return this.balance;
    }
}
