package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BagOfChars {

    public static void main(String[] args) {

        String textToConvert;
        Scanner input = new Scanner(System.in);
        System.out.println("Type anything you'd like and I'll tell you how many of each character you typed.");
        textToConvert = input.nextLine();
        char[] charactersInString = textToConvert.toLowerCase().toCharArray();

        HashMap<Character, Integer> charsWithCount = new HashMap<>();

        for ( char letter : charactersInString) {
            if (Character.isLetter(letter)) {
                if (charsWithCount.containsKey(letter)) {
                    charsWithCount.put(letter, charsWithCount.get(letter) + 1);
                } else {
                    charsWithCount.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> letter : charsWithCount.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }

    }
}
