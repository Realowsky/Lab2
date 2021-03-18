package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("przemysław Pawluk");
        //acc.name = "Przemysław Pawluk";
        System.out.println(acc.getName());
        System.out.printf("%s%n", Account.capitalize("stanisŁaw maruSARz"));
        System.out.println(Account.translit(acc.getName()));
        System.out.println(Account.translit("Любава"));
        System.out.println(Account.translit("Федоров"));
    }

}
