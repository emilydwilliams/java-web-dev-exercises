package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you gone through?");
        double gallonsUsed = input.nextDouble();
        input.close();
        double milesPerGallon = milesDriven / gallonsUsed;
        System.out.println("Congrats! You get " + milesPerGallon + " miles per gallon.");
    }
}
