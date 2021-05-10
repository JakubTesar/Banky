package logic;

public class BankAccount {
    private Human user;
    private int money;
    private int id;

    public BankAccount(Human user, int id) {
        this.money = 0;
        this.user = user;
        this.id = id;
    }

    public void addMoney(int money2) {
        this.money += money2;
    }

    public boolean removeMoney(int money2) {
        if (this.money - money2 >= 0) {
            this.money -= money2;
            return true;
        }
        return false;
    }

    public void transferMoney(BankAccount account, int amount) {
        if (removeMoney(amount)) {
            account.addMoney(amount);
        }
    }

    public int getMoney() {
        return money;
    }
    public int getId() {
        return id;
    }
    public Human getUser() {
        return user;
    }

}
