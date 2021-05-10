package presentation;

import logic.Bank;
import logic.Human;

public class show {

    public static void vypis() {
        Bank bank1 = new Bank("Aznoh bank");
        Human pavel = new Human("Pavel", 123, false);
        pavel.createAccount(bank1);

        Bank bank2 = new Bank("Pepko bank");
        Human karel = new Human("Karel", 420, false);
        karel.createAccount(bank2);

        pavel.addMoney(bank1.getAccountByName(pavel), 500);
        System.out.println("Pavlovi se přidalo "+bank1.getAccountByName(pavel).getMoney());
        System.out.println();

        bank1.getAccountByName(pavel).transferMoney(bank2.getAccountByName(karel), 350);
        System.out.println("Pavel poslal Karlovi 350 a teď má jenom "+bank1.getAccountByName(pavel).getMoney());
        System.out.println("Karel dostal od pavla "+bank2.getAccountByName(karel).getMoney());
        System.out.println();

        karel.withDrawMoney(bank2.getAccountByName(karel), 200);
        System.out.println("Karel si vybral 200");
        System.out.println("Karlov má na účtě "+ bank2.getAccountByName(karel).getMoney());
        System.out.println();

        karel.withDrawMoney(bank2.getAccountByName(karel), 500);
        System.out.println("Karel si chtěl vybrat 500, ale na účtě má jen 150 takže se nic nestalo.");
        System.out.println("Karlov má na účtě "+ bank2.getAccountByName(karel).getMoney());
        System.out.println();

        
    }
}
