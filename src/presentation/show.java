package presentation;

import logic.Bank;
import logic.BankAccount;
import logic.People;

import java.util.ArrayList;
import java.util.Scanner;

public class show {

    public static void vypis() {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        String bankName = "";
        String choise = "";
        String choise2 = "";
        String name = "";
        boolean male = false;
        int birthNumber = 0;
        Bank bank = new Bank(bankName, id);

        System.out.println("Do jaké banky se chcete podívat?");
        System.out.println("Máte na výber ze tří bank: ");
        System.out.println();
        System.out.println("Zadejte 1 pokud chcete Českou spořitelna");
        System.out.println("Zadejte 2 pokud chcete Komerční banka");
        System.out.println("Zadejte 3 pokud chcete Equa bank");
        choise = sc.nextLine();

        if (choise.equals("1")) {
            bankName = "Česká spořitelna";
            id = 45244782;
            System.out.println("Vybrali jste si " + bank.getName());
        }
        if (choise.equals("2")) {
            bankName = "Komerční banka";
            id = 25634895;
            System.out.println("Vybrali jste si " + bank.getName());
        }
        if (choise.equals("3")) {
            bankName = "Equa bank";
            id = 53244582;
            System.out.println("Vybrali jste si " + bank.getName());
        }

        System.out.println("-------------------------------------");
        System.out.println("Nyní nám sdělte vaše osobní údaje");
        System.out.println("-------------------------------------");
        System.out.println("Jméno:");
        name = sc.nextLine();

        System.out.println("muž nebo žena?");
        choise2 = sc.nextLine();
        if (choise2.equals("muž")) male = (true);
        if (choise2.equals("žena")) male = (false);

        System.out.println("Rodné číslo");
        birthNumber = sc.nextInt();

        People human = new People(name, birthNumber, male);

        String choise3 = "";
        int money = 0;
        int money2 = 0;

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("Vyberte co chcete udělat:");
            System.out.println("Zvolte 1 pro: Vytvořit účet v " + bankName);
            System.out.println("Zvolte 2 pro: Smazání účtu v " + bankName);
            System.out.println("Zvolte 3 pro: Přidání peněz na účet");
            System.out.println("Zvolte 4 pro: Odebrání peněz");
            choise3 = sc.nextLine();

            if (choise3.equals("1")) {
                bank.createAccount(human);
            }
            if (choise3.equals("2")) {
                bank.deleteAccount(id);
            }
            if (choise3.equals("3")) {
                System.out.println("Kolik chcete vložit peněz?");
                money = sc.nextInt();
                for (int i = 0; i < Bank.getAccounts().size(); i++) {
                    if (Bank.getAccounts().get(i).getId() == id) {
                        People.addMoneyHuman(Bank.getAccounts().get(i), money);
                        break;
                    }
                }
            }
            if (choise3.equals("3")) {
                System.out.println("Kolik chcete vybrat peněz?");
                money2 = sc.nextInt();
                System.out.println("Pokud vá peníze nelze vybrat, tak jste vybrali až příliš moc.");
                for (int i = 0; i < Bank.getAccounts().size(); i++) {
                    if (Bank.getAccounts().get(i).getId() == id) {
                        People.takeMoney(Bank.getAccounts().get(i), money2);
                        break;
                    }
                }
            }
        }
    }


}
