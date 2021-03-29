package com.globant.howtodoinjava.faq;

import javax.jws.soap.SOAPBinding;

public class CountDuplicates {
    public static void main(String[] args) {
        String s = "ABC DEF ABC GEH IJL LMO ABCD";
        System.out.println(count(s, 'A'));
    }

    public static int count(String word, Character ch) {
        int pos = word.indexOf(ch);
        return pos == -1 ? 0 : 1 + count(word.substring(pos + 1), ch);
    }
}
