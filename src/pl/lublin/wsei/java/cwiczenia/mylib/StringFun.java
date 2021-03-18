package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class StringFun {

    //public static boolean isPalindrome(String word){

    //    return false;
    public static boolean isPalindrome(String tekst){
        boolean res = false;
        tekst = tekst.toLowerCase();
        tekst = tekst.replace ("", "");
        String check = "";
        char[] CharList = tekst.toCharArray();
        for (int i = tekst.length()-1; i>=0; i--){
            check += CharList[i];
        }
        if(tekst.equals(check)){
            res = true;
        }
        return res;
        }
    }

    public static String anarchize(String tekst2) {
        String res = "";
        boolean lower = Character.isLowerCase(tekst2.charAt(0));
        for (int i = 0; i < tekst2.length(); i++) {
            if (lower)
                res += Character.toUpperCase(tekst2.charAt(i));
            else
                res += Character.toLowerCase(tekst2.charAt(i));
            lower = !lower;
        }
        return res;
    }
    public static String camelize(String tekst) {
        String[] tokens = StringUtils.split(StringUtils.normalizeSpace(tekst));
        if (tokens.length == 0) return "";
        String res = tokens[0].toLowerCase();
        for (int i = 1; i < tokens.length; i++){
           // res += StringUtils.capitalize(tokens[i].toUpperCase());
            res += StringUtils.capitalize(tokens[i]);
        }

        return res;
    }

    public static String decamelize(String text) {
        String[] tokens = StringUtils.split(StringUtils.normalizeSpace(text));
        String res = "";
        for(int i = 0; i < tokens.length; i++){
            res += StringUtils.uncapitalize(tokens[i].toUpperCase());
        }
        return res;
    }
}
