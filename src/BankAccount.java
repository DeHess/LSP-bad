public class BankAccount {

    protected int balance;

    public BankAccount(int startingAmount) {
        this.balance = startingAmount;
    }

    //Tax Free Withdrawal
    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
