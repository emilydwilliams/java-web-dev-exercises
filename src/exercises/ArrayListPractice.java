package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> funNums = new ArrayList<>();
        funNums.add(1);
        funNums.add(2);
        funNums.add(3);
        funNums.add(4);
        funNums.add(5);
        funNums.add(6);
        funNums.add(7);
        funNums.add(8);
        funNums.add(9);
        funNums.add(10);

        addEvens(funNums);

        ArrayList<String> funWords = new ArrayList<>();
        funWords.add("music");
        funWords.add("bunny");
        funWords.add("book");
        funWords.add("Dylan");
        funWords.add("Christmas");
        funWords.add("candy");

        printFiveLetterWords(funWords);
    }

    public static void addEvens(ArrayList<Integer> nums) {
        Integer sum = 0;
        for (Integer num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    public static void printFiveLetterWords(ArrayList<String> words) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many letters should each word have?");
        int numLetters = input.nextInt();

        for (String word : words) {
            if (word.length() == numLetters) {
                System.out.println(word);
            }
        }
    }
}
