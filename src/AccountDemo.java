public class AccountDemo {
    public static void main(String[] args) {
        Account myaAcc = new Account();
        Account hlaAcc = new Account();

        myaAcc.credit(250);
        myaAcc.debit(200);

        hlaAcc.credit(1000);
        hlaAcc.debit(1000);

        System.out.println(myaAcc.getBalance());
        System.out.println(hlaAcc.getBalance());
    }
}
