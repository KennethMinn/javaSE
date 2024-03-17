public class Account {
    private int balance;
    public  void debit (int amount) {
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
        }
    }
    public  void credit (int amount) {
        this.balance += amount;
    }

    public  int getBalance () {
        return this.balance;
    }
}
