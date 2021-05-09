package logic;

public class BankAccount {
    private People user;
    private int money;
    private int id;

    public BankAccount(People user, int id) {
        this.money = 0;
        this.user = user;
        this.id = id;
    }

    public void addMoneyAccount(int money2) {
         this.money += money2;
    }

    public void removeMoneyAccount(int money2) {
        if (this.money >= 0){
            this.money -= money2;
        }
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public People getUser() {
        return user;
    }
}
