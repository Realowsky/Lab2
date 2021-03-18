package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class AnarchizeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
            String tekst2 = scn.next();
            if (tekst2.equals("0")) break;
            System.out.println("Tekst: " + tekst2 + ", tekst zanarchizowany: " +
                    StringFun.anarchize(tekst2));
        }while(true);
    }
}
