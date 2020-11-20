package exercises;

import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        System.out.println("Enter a word: ");
        String searchTerm = input.next();
        int cutOff = aliceText.indexOf(searchTerm);
        int newStart = cutOff + searchTerm.length() + 1;
        System.out.println("Your word is found in the passage at index " + aliceText.indexOf(searchTerm) + " and is " + searchTerm.length() + " characters long.");
        input.close();
        String newAliceText = aliceText.substring(0, cutOff) + aliceText.substring(newStart,aliceText.length());
        System.out.println(newAliceText);
    }
}