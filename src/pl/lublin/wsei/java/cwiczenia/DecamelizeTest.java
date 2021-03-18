package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class DecamelizeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Print test do sprawdzenia (0, jak Ci się znudzi): ");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.println("Tekst: " + text + ", tekst zdekamelizowany: " +
                    StringFun.decamelize(text));
        }while(true);
    }
}
