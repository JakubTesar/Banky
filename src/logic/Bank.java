package logic;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private static ArrayList<BankAccount> accounts;
    private String name;
    private final int id;

    public Bank(String name, int id) {
        this.accounts = new ArrayList<>();
        this.name = name;
        this.id = id;
    }
    public BankAccount createAccount(People user) {
        int acId = Integer.parseInt(this.id + "" + getNewAccountID());
        BankAccount newAccount = new BankAccount(user, acId);
        this.accounts.add(newAccount);
        return newAccount;
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
    public void deleteAccount(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (this.accounts.get(i).getId() == id) {
                this.accounts.remove(i);
                break;
            }
        }
    }

    public static ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public static void sendMoney(BankAccount accountSender, BankAccount accountReceiver, int money2) {
        accountSender.removeMoneyAccount(money2);
        accountReceiver.addMoneyAccount(money2);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBankID() {
        return id;
    }
}

