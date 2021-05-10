package logic;
public class Human {

    private boolean male;
    private String name;
    private int birthNumber;

    public Human (String name, int birthNumber, boolean male) {
        this.male = male;
        this.name = name;
        this.birthNumber = birthNumber;
    }

    public void createAccount(Bank bank) {
        bank.createNewAccount(this);
    }
    public void deleteAccount(Bank bank){
        bank.deleteAccount(this);
    }
    public void addMoney(BankAccount account, int money){
        account.addMoney(money);
    }
    public void withDrawMoney(BankAccount account, int money){
        account.removeMoney(money);
    }

    public String getName() {
        return name;
    }
    public int getBirthNumber() {
        return birthNumber;
    }
    public boolean isMale() {
        return male;
    }
}
