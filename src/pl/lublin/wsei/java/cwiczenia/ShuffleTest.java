package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class ShuffleTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String tekst;
        System.out.println("Podaj tekst do przetasowania: ");
        tekst = scn.nextLine();
        System.out.println("Przetasowany tekst: " + StringFun.Shuffle(tekst));
    }
}
