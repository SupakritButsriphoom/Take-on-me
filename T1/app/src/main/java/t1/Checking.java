package t1;

public class Checking extends BankAccount {
    public void deposit(String account, float money) {
        if (this.account == account) {
            this.money += money;
        }
    }

    public void deposit(float money) {
        this.money += money;
    }

    Checking(String account){
        super(account);
    }
}
