package t1;

public class Saving extends BankAccount{
    private double interest =0.02;
    public void deposit(String account, float money) {
        if (this.account == account) {
            this.money += (money+money*interest);
        }
    }

    public void deposit(float money) {
        this.money += money;
    }

    Saving(String account){
        super(account);
    }
}