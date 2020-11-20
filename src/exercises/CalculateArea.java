package exercises;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! \nLet's calculate the area of a rectangle. \nGive me a length:");
        int length = input.nextInt();
        System.out.println("Awesome! Our rectangle has a length of " + length + ". \nGive me a width:");
        int width = input.nextInt();
        input.close();
        int area = length * width;
        System.out.println("The area of the rectangle is " + area + ".");
    }
}
