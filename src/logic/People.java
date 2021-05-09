package logic;

public class People {

    private boolean male;
    private String name;
    private int birthNumber;

    public People(String name, int birthNumber, boolean male) {
        this.male = male;
        this.name = name;
        this.birthNumber = birthNumber;
    }

    public void createAccount(Bank bank) {
        bank.createAccount(this);
    }

    public static void deleteAccount(BankAccount account, Bank bank) {
        bank.deleteAccount(account.getId());
    }

    public static void addMoneyHuman(BankAccount account, int money2) {
        account.addMoneyAccount(money2);
    }

    public static void takeMoney(BankAccount account, int money2) {
        account.removeMoneyAccount(money2);
    }

    public boolean isMale() {
        return male;
    }
    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBirthNumber() {
        return birthNumber;
    }
    public void setBirthNumber(int birthNumber) {
        this.birthNumber = birthNumber;
    }
}
