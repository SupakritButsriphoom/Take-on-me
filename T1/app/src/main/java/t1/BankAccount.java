package t1;

public abstract class BankAccount {
    public final String account;
    protected float money;
    BankAccount(String account){
        this.account = account;
    }
    public abstract void deposit(String account,float money);
    public abstract void deposit(float money);
}
