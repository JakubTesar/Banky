package logic;
import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private ArrayList<BankAccount> accounts;
    private String name;

    public Bank(String name) {
        this.accounts = new ArrayList<>();
        this.name = name;
    }

    public void createNewAccount(Human human){
        accounts.add(new BankAccount(human, getNewAccountID()));
    }
    public void deleteAccount(Human human){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUser().getName().equals(human.getName())){
                accounts.remove(i);
                break;
            }
        }
    }
    private int getNewAccountID() {
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<BankAccount> bankAccounts = this.accounts;

        for (int i = 0; i < bankAccounts.size(); i++) {
            BankAccount account = bankAccounts.get(i);
            ids.add(account.getId());
        }
        Random rand = new Random();
        int randID = rand.nextInt(89999) + 10000;
        while (ids.contains(randID)) {
            randID = rand.nextInt(89999) + 10000;
        }
        return randID;
    }

    public BankAccount getAccountByName(Human human){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUser().getName().equals(human.getName())){
                return accounts.get(i);
            }
        }
        return null;
    }
}

