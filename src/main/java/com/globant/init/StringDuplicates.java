package com.globant.init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;

public class StringDuplicates {

    public static class EmptyStringException extends Exception {
        public EmptyStringException() {
            super("Empty exception");
        }
    }

    public static Map<Character, Integer> print(String inputString) throws EmptyStringException {
        if (inputString == null) {
            throw new NullPointerException();
        }
        if (inputString.isEmpty()) {
            throw new EmptyStringException();
        }
        Map<Character, Integer> duplicates = new HashMap<>();
//        for (String character : inputString.split("")) {
        for (char character : inputString.toCharArray()) {
            if (duplicates.get(character) == null) {
                duplicates.put(character, 1);
            } else {
                duplicates.put(character, duplicates.get(character) + 1);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) throws IOException, EmptyStringException {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        Map<Character, Integer> duplicates = print(name);
        for (Map.Entry<Character, Integer> entry : duplicates.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " :: Count: " + entry.getValue());
        }

        wr.close();
        br.close();
    }
}
